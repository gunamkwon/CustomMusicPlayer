package com.example.custommusicplayer.model;

import android.graphics.Bitmap;

public class Music {
    private String name;
    private String singer;
    private String albumName;
    private Bitmap albumImage;
    private String url;

    public Music(String name ,String singer){
        this.name = name;
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }

    public Bitmap getAlbumImage() {
        return albumImage;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getUrl() {
        return url;
    }
}
