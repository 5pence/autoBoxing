package com.spencer;

import java.util.List;
import java.util.ArrayList;

public class Player implements ISaveable {

    private String name;
    private int score = 0;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.score);
        return values;
    }

    @Override
    public void read(List<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            this.name = arrayList.get(0);
            this.score = Integer.parseInt(arrayList.get(1));
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
