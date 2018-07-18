package com.example.akash.spela_music_player;

public class Album {
    private String Title;
    private String Artist;


    public Album(String title, String artist) {
        Title = title;
        Artist = artist;
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
}
