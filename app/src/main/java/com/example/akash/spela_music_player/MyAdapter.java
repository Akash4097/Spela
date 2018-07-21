package com.example.akash.spela_music_player;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Album> albumList;

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView title, artist;
        public ImageView thumbnail;
        public ImageButton play, pause;

        public ViewHolder(View v) {
            super(v);
            title = v.findViewById(R.id.title);
            artist = v.findViewById(R.id.artist);
            thumbnail = v.findViewById(R.id.thumbnail);
            play = v.findViewById(R.id.playButton);
            pause = v.findViewById(R.id.pauseButton);

            play.setOnClickListener(this);
            pause.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == play.getId()) {
                pause.setVisibility(View.VISIBLE);
                play.setVisibility(View.GONE);
            } else if (v.getId() == pause.getId()) {
                pause.setVisibility(View.GONE);
                play.setVisibility(View.VISIBLE);
            }
        }

    }

    public MyAdapter(List<Album> albumsList) {
        this.albumList = albumsList;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.songs_list_row, parent, false);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainPlayerActivity.class);
                v.getContext().startActivity(intent);
            }
        });
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Album album = albumList.get(position);
        holder.title.setText(album.getTitle());
        holder.artist.setText(album.getArtist());
        holder.thumbnail.setImageDrawable(album.getThumbnail());

    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }
}
