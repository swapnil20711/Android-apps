package com.swapnil.coffee_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private int coffeePrice = 35;
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
        cp = coffeePrice * mCount;
        if (showCP != null) {
            showCP.setText("$" + Double.toString(cp));
        }

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.show_count);
        quantityTextView.setText("" + number);
    }

    public void PlusCoffee(View view) {
        ++mCount;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void MinusCoffee(View view) {
        --mCount;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}