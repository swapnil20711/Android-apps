package com.swapnil.convertex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_click(View view) {
        EditText dollaramount = (EditText) findViewById(R.id.text_money1);
        String dollar = dollaramount.getText().toString();
        Double Doubledollars = Double.parseDouble(dollar);
        Double inr = 75.34 * Doubledollars;
        Toast.makeText(this, "The value of " + Doubledollars.toString() + "  = " + " ₹ " + inr.toString(), Toast.LENGTH_SHORT).show();
    }
}
