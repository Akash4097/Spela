package com.example.akash.spela_music_player;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Album> albumList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title,artist;

        public ViewHolder(View v) {
            super(v);
            title = v.findViewById(R.id.title);
            artist = v.findViewById(R.id.artist);
        }
    }

    public MyAdapter(List<Album> albumsList) {
        this.albumList = albumsList;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        View itemView =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.songs_list_row, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
           Album album = albumList.get(position);
           holder.title.setText(album.getTitle());
           holder.artist.setText(album.getArtist());
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }
}
