package com.spencer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Please enter int for times table: ");
	    x(x.nextInt());
    }

    private static void x(int xx) {
        for (int x=1; x <= xx; x++ ) {
            System.out.println(x + " times " + x + " = " + x*xx);
        }
    }
}
