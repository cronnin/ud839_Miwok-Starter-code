package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Marcelo on 08/05/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {

        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView dTextView = (TextView) listItemView.findViewById(R.id.defaultText);
        dTextView.setText(currentWord.getDefaultText());

        TextView mTextView = (TextView) listItemView.findViewById(R.id.miwokText);
        mTextView.setText(currentWord.getMiwokText());

        return listItemView;
    }
}