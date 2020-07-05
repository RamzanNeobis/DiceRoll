package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array of words

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "apa"));
        words.add(new Word("mother", "ata"));
        words.add(new Word("son", "angsi"));
        words.add(new Word("dauther", "tune"));
        words.add(new Word("older brother", "taachi"));
        words.add(new Word("younger brother", "chalitti"));
        words.add(new Word("older sister", "kolliti"));
        words.add(new Word("younger sister", "tete"));
        words.add(new Word("grandmother", "ama"));
        words.add(new Word("grandfather", "paapa"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}