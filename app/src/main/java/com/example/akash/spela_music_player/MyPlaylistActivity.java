package com.example.akash.spela_music_player;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

import static java.security.AccessController.getContext;

public class MyPlaylistActivity extends AppCompatActivity {

    private List<Album> albumList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_playlist);

        mRecyclerView = findViewById(R.id.myPlaylist_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(albumList);
        mRecyclerView.setAdapter(mAdapter);
        prepareAlbumData();


    }

    private void prepareAlbumData() {
        Album album = new Album("AgneePath","Sonu nigam",getResources().getDrawable(R.drawable.agneepath));
        albumList.add(album);

        album = new Album("Border","Annu malik",getResources().getDrawable(R.drawable.border));
        albumList.add(album);

        album = new Album("Border","Annu malik",getResources().getDrawable(R.drawable.border));
        albumList.add(album);

        album = new Album("Border","Annu malik",getResources().getDrawable(R.drawable.border));
        albumList.add(album);
        album = new Album("Border","Annu malik",getResources().getDrawable(R.drawable.border));
        albumList.add(album);
        album = new Album("Border","Annu malik",getResources().getDrawable(R.drawable.border));
        albumList.add(album);
        album = new Album("Border","Annu malik",getResources().getDrawable(R.drawable.border));
        albumList.add(album);
        album = new Album("Border","Annu malik",getResources().getDrawable(R.drawable.border));
        albumList.add(album);
        album = new Album("Border","Annu malik",getResources().getDrawable(R.drawable.border));
        albumList.add(album);
        album = new Album("Border","Annu malik",getResources().getDrawable(R.drawable.border));
        albumList.add(album);
        album = new Album("Border","Annu malik",getResources().getDrawable(R.drawable.border));
        albumList.add(album);

        mAdapter.notifyDataSetChanged();
    }

}
