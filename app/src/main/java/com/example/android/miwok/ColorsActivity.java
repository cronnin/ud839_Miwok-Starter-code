package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.color.black;
import static android.R.color.white;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> colors = new ArrayList<Word>();

        colors.add(new Word("Vermelho","weṭeṭṭi"));
        colors.add(new Word("Verde","chokokki"));
        colors.add(new Word("Marrom","ṭakaakki"));
        colors.add(new Word("Cinza","ṭopoppi"));
        colors.add(new Word("Preto","kululli"));
        colors.add(new Word("Branco","kelelli"));
        colors.add(new Word("Amarelo","ṭopiisә"));
        colors.add(new Word("Amarelo Mostarda","chiwiiṭә"));

        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, numbers);
        WordAdapter adapter = new WordAdapter(this, colors);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
