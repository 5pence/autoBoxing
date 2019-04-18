package com.spencer;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<E extends Team> {

    private ArrayList<E> teams;
    private String name;

    public LeagueTable(String name) {
        this(new ArrayList<E>(), name);
    }

    public LeagueTable(ArrayList<E> teams, String name) {
        this.teams = teams;
        this.name = name;
    }

    public void add(E team) {
        teams.add(team);
    }

    protected void printLeagueTable() {
        Collections.sort(this.teams);
        System.out.println("================== " + this.name + " ======================");
        for (E team : teams) {
            System.out.println( team.getName() + " ........ " + team.getScore());
        }
        System.out.println("=================================================");
    }

}
