package com.swapnil.coffee_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
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
    private String order1;

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
        EditText edit = (EditText) findViewById(R.id.name_field);
        String name = edit.getText().toString();
        CheckBox cream = (CheckBox) findViewById(R.id.c1);
        cp = coffeePrice * mCount;
        boolean hasCream = cream.isChecked();
        if (hasCream) {
            String order = "Name:" + name + "\n" + "Whipped cream added to your coffee\n" + "Quantity:" + mCount + "\nAmount due ₹ " + Double.toString(cp + 5 * mCount) + "\nThank you";
            if (cp == 0) {
                showCP.setText("₹ 0");
            } else {
                showCP.setText(order);
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Ordering coffee for " + name);
                intent.putExtra(Intent.EXTRA_TEXT, order);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(Intent.createChooser(intent, "Send Email"));
                }
            }
        } else {
            String order1 = "Name:" + name + "\n" + "Can you add some Whipped cream?\n" + "Quantity:" + mCount + "\nAmount due ₹ " + Double.toString(cp) + "\nThank you";
            if (cp == 0) {
                showCP.setText("₹ 0");
            } else {
                showCP.setText(order1);

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Ordering coffee for " + name);
                intent.putExtra(Intent.EXTRA_TEXT, order1);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(Intent.createChooser(intent, "Send Email"));
                }
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