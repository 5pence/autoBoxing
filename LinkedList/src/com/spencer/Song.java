package com.spencer;

public class Song {

    private String Title;
    private int duration;

    public Song(String title, int duration) {
        Title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return Title;
    }
}
