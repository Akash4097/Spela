package com.example.akash.spela_music_player;

import android.graphics.drawable.Drawable;

public class Album {
    private String Title,Artist;
    private Drawable Thumbnail;

    public Album(String title, String artist,Drawable thumbnail) {
        this.Title = title;
        this.Artist = artist;
        this.Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public String getArtist() {
        return Artist;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public Drawable getThumbnail() {
        return Thumbnail;
    }
}
