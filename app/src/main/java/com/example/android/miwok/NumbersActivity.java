package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbers = new ArrayList<Word>();

        numbers.add(new Word("Um","Iutti"));
        numbers.add(new Word("Dois","Otiiko"));
        numbers.add(new Word("Três","Tolookosu"));
        numbers.add(new Word("Quatro","Oyyisa"));
        numbers.add(new Word("Cinco","Massokka"));
        numbers.add(new Word("Seis","Temmokka"));
        numbers.add(new Word("Sete","Kenekaku"));
        numbers.add(new Word("Oito","Kawinta"));
        numbers.add(new Word("Nove","Wo'e"));
        numbers.add(new Word("Dez","Na'aacha"));

      //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, numbers);
        WordAdapter adapter = new WordAdapter(this, numbers);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}