package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.miwok.R.layout.word_list;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(word_list);

        ArrayList<Word> phrases = new ArrayList<Word>();

        phrases.add(new Word("Onde você vai?","minto wuksus"));
        phrases.add(new Word("Qual o seu nome?","tinnә oyaase'nә"));
        phrases.add(new Word("Meu nom é..","oyaaset.."));
        phrases.add(new Word("Como você está se sentindo?","michәksәs?"));
        phrases.add(new Word("Estou me sentindo bem.","kuchi achit"));
        phrases.add(new Word("Você está vindo?","әәnәs'aa?"));
        phrases.add(new Word("Sim, estou indo.","hәә’ әәnәm"));
        phrases.add(new Word("Estou indo.","әәnәm"));
        phrases.add(new Word("Vamos lá."," yoowutis"));
        phrases.add(new Word("Venha aqui.","әnni'nem"));
        
        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, numbers);
        WordAdapter adapter = new WordAdapter(this, phrases);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
