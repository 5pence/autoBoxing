package com.spencer;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Royal", 8, 12);
	//    theatre.getSeats();
	    if (theatre.reverseSeat("H11")) {
            System.out.println("Please Pay");
        } else {
            System.out.println("Seat already taken");
        }
        if (theatre.reverseSeat("H11")) {
            System.out.println("Please Pay");
        } else {
            System.out.println("Seat already taken");
        }
    }
}
