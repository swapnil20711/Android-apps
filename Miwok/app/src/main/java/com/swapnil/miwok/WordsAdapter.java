package com.swapnil.miwok;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordsAdapter extends ArrayAdapter<Word> {
    public WordsAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word currentNumber = getItem(position);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView miwok = (TextView) listItemView.findViewById(R.id.miwok_trans);
        miwok.setText(currentNumber.getMiwokTranslation());
        TextView english = (TextView) listItemView.findViewById(R.id.english_trans);
        english.setText(currentNumber.getDefaultTranslationTranslation());
        return listItemView;

    }
}
