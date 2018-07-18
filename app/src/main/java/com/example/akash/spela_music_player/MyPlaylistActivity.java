package com.example.akash.spela_music_player;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

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

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(albumList);
        mRecyclerView.setAdapter(mAdapter);
        
        prepareAlbumData();
    }

    private void prepareAlbumData() {
        Album album = new Album("AgneePath","Sonu nigam");
        albumList.add(album);

        album = new Album("Border","Annu malik");
        albumList.add(album);

        album = new Album("Border","Annu malik");
        albumList.add(album);

        album = new Album("Border","Annu malik");
        albumList.add(album);
        album = new Album("Border","Annu malik");
        albumList.add(album);
        album = new Album("Border","Annu malik");
        albumList.add(album);
        album = new Album("Border","Annu malik");
        albumList.add(album);
        album = new Album("Border","Annu malik");
        albumList.add(album);
        album = new Album("Border","Annu malik");
        albumList.add(album);
        album = new Album("Border","Annu malik");
        albumList.add(album);
        album = new Album("Border","Annu malik");
        albumList.add(album);

        mAdapter.notifyDataSetChanged();
    }
}
