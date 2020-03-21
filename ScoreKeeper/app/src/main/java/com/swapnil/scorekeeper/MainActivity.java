package com.swapnil.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView score;
    private TextView scoreb;
    private int mScore = 0;
    private int mScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score = findViewById(R.id.score_match);
        scoreb = findViewById(R.id.score_matchB);

    }

    public void btn_2(View view) {
        mScore += 2;
        score.setText(Integer.toString(mScore));
    }

    public void btn_3(View view) {
        mScore += 3;
        score.setText(Integer.toString(mScore));
    }

    public void btn_free(View view) {
        mScore += 1;
        score.setText(Integer.toString(mScore));
    }

    public void btn_reset(View view) {
        mScore = 0;
        score.setText(Integer.toString(mScore));
    }

    public void btn_freeB(View view) {
        mScoreB += 1;
        scoreb.setText(Integer.toString(mScoreB));
    }

    public void btn_3B(View view) {
        mScoreB += 3;
        scoreb.setText(Integer.toString(mScoreB));
    }

    public void btn_2B(View view) {
        mScoreB += 2;
        scoreb.setText(Integer.toString(mScoreB));
    }

    public void btn_resetB(View view) {
        mScoreB = 0;
        scoreb.setText(Integer.toString(mScoreB));
    }

    public void btn_cmp(View view) {
        if (mScore > mScoreB) {
            Toast.makeText(this, "Team A won the match", Toast.LENGTH_SHORT).show();
        } else if (mScoreB == mScore) {
            Toast.makeText(this, "Math tied", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Team B won the match", Toast.LENGTH_SHORT).show();
        }
        mScoreB = 0;
        score.setText(Integer.toString(mScoreB));
        mScore = 0;
        scoreb.setText(Integer.toString(mScore));
    }
}
