package com.androidclase.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private LinkedList<String> mWordList = new LinkedList<String>();
    private int SIZE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < SIZE; i++) {
            String text = "TextView " + (i + 1);
            mWordList.add(text);
        }

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new WordListAdapter(this, mWordList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        int wordListSize = mWordList.size();
        mRecyclerView.smoothScrollToPosition(wordListSize/2);
    }

}