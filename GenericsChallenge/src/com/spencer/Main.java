package com.spencer;

public class Main {

    public static void main(String[] args) {
	    FootballTeam team = new FootballTeam("Pompey", 3,2,1,10);
	    FootballTeam team2 = new FootballTeam("Ipswich", 4,1,1,13);
	    FootballTeam team3 = new FootballTeam("Antrim", 1,4,1,4);

	    BasketballTeam team4 = new BasketballTeam("AllStars", 1,4,1,4);
	    BasketballTeam team5 = new BasketballTeam("NYC", 2,2,0,6);
	    BasketballTeam team6 = new BasketballTeam("Chicago", 1,4,1,4);
	    BasketballTeam team7 = new BasketballTeam("Globe Trotters", 4,0,0,12);

        LeagueTable<FootballTeam> footbalLeague = new LeagueTable<>("UEFA");
        footbalLeague.add(team);
        footbalLeague.add(team2);
        footbalLeague.add(team3);

        LeagueTable<BasketballTeam> basketLeague = new LeagueTable<>("NBA");
        basketLeague.add(team4);
        basketLeague.add(team5);
        basketLeague.add(team6);
        basketLeague.add(team7);

        footbalLeague.printLeagueTable();
        basketLeague.printLeagueTable();
    }
}
