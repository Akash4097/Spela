package com.example.akash.spela_music_player;

public class Album {
    private String Title;
    private String Artist;
    private String Thumbnail;

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

    public String getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        Thumbnail = thumbnail;
    }
}
