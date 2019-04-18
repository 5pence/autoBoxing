package com.spencer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    ArrayList<Song> songs = new ArrayList<>();

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    protected void addSongToAlbum(Song song) {
        this.songs.add(song);
    }
}
