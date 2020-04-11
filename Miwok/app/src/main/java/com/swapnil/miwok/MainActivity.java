package com.swapnil.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumbersList(View view) {
        Intent Numbers = new Intent(this, NumbersActivity.class);
        startActivity(Numbers);


    }

    public void openFamilyList(View view) {
        Intent Family = new Intent(this, FamilyActivity.class);
        startActivity(Family);
    }

    public void openColorsList(View view) {
        Intent Color = new Intent(this, ColorsActivity.class);
        startActivity(Color);
    }

    public void openPhrasesList(View view) {
        Intent Phrase = new Intent(this, PhrasesActivity.class);
        startActivity(Phrase);
    }
}
