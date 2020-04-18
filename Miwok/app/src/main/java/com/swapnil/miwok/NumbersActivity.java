package com.swapnil.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {
    private String []words=new String[]{"one","two","three","four","five","six","seven","eight","nine","ten"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        for(int i=0;i<words.length;i++) {
            Log.v("NumbersActivity", words[i]);
        }
    }
}