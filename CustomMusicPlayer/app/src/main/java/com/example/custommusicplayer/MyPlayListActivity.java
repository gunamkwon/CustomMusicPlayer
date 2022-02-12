package com.example.custommusicplayer;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.custommusicplayer.adapter.PlayListAdapter;
import com.example.custommusicplayer.model.Music;

import java.util.ArrayList;

public class MyPlayListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Music> playList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_current_playlist);

        initList();
        initRecyclerView();
    }

    private void initList() {
        playList = new ArrayList<>();
        for(int i=0;i<10;i++){
            playList.add(new Music("Love peom", "아이유(IU)"));
        }
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.rv_playlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        PlayListAdapter adapter = new PlayListAdapter(playList);
        recyclerView.setAdapter(adapter);
    }
}
