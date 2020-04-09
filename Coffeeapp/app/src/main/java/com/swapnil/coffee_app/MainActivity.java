package com.swapnil.coffee_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private int coffeePrice = 5;
    private double cp;
    private TextView mShowCount;
    private TextView showCP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        showCP = (TextView) findViewById(R.id.price_text_view);

    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        CheckBox cream = (CheckBox) findViewById(R.id.c1);
        cp = coffeePrice * mCount;
        boolean hasCream = cream.isChecked();
        if (hasCream) {
            if (cp == 0) {
                showCP.setText("₹ 0");
            } else {
                showCP.setText("Name:Swapnil bhojwani\n" + "Whipped cream added to your coffee\n" + "Quantity:" + mCount + "\nAmount due ₹ " + Double.toString(cp + 5*mCount) + "\nThank you");
            }
        } else {
            if (cp == 0) {
                showCP.setText("₹ 0");
            } else {
                showCP.setText("Name:Swapnil bhojwani\n" + "Can you add some Whipped cream?\n" + "Quantity:" + mCount + "\nAmount due ₹ " + Double.toString(cp) + "\nThank you");
            }
        }


    }

    public void PlusCoffee(View view) {
        ++mCount;
        if (mCount >= 0) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void MinusCoffee(View view) {
        --mCount;
        if (mCount >= 0) {
            mShowCount.setText(Integer.toString(mCount));
        } else {
            mCount = 0;
            mShowCount.setText(Integer.toString((mCount)));
            Toast toast = Toast.makeText(this, "You cannot have negative quantity of coffee", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}