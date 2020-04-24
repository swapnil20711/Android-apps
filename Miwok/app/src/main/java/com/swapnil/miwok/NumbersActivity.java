package com.swapnil.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    private ArrayList<String> words = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayAdapter<String> displayWords = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, words);
        ListView list = (ListView) findViewById(R.id.list_item);
        list.setAdapter(displayWords);

//        for (int i = 0; i < words.size(); i++) {
//            TextView display = new TextView(this);
//            display.setText(words.get(i));
//        }
    }
}