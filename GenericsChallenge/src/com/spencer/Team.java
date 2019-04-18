package com.spencer;

public abstract class Team implements Comparable<Team> {

    private int wins, lost, draw, score;
    private String name;

    public Team(String name, int wins, int lost, int draw, int score) {
        this.name = name;
        this.wins = wins;
        this.lost = lost;
        this.draw = draw;
        this.score = score;
    }

    public int getWins() {
        return wins;
    }

    public int getLost() {
        return lost;
    }

    public int getDraw() {
        return draw;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Team team) {
        if (this.score > team.getScore()) {
            return - 1;
        } else if (this.score < team.getScore()) {
            return 1;
        } else {
            return 0;
        }
    }
}
