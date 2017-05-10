package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.numbers;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> familyMembers = new ArrayList<Word>();

        familyMembers.add(new Word("Pai","әpә"));
        familyMembers.add(new Word("Mãe","әṭa"));
        familyMembers.add(new Word("Filho","angsi"));
        familyMembers.add(new Word("Filha","tune"));
        familyMembers.add(new Word("Irmão mais velho","taachi"));
        familyMembers.add(new Word("Irmão mais novo","chalitti"));
        familyMembers.add(new Word("Irmã mais velha","teṭe"));
        familyMembers.add(new Word("Irmã mais nova","kolliti"));
        familyMembers.add(new Word("Avó","ama"));
        familyMembers.add(new Word("Avô","paapa"));


        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, numbers);
        WordAdapter adapter = new WordAdapter(this, familyMembers);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
