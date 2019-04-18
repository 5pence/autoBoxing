package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println(toMilesPerHour(1.5d));
        System.out.println(toMilesPerHour(10.25d));
        System.out.println(toMilesPerHour(-5.6d));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114d));
        printConversion(1.5d);
        printConversion(10.25d);
        printConversion(-5.6d);
        printConversion(25.42d);
        printConversion(75.114d);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1L;
        }
        if (kilometersPerHour >= 0) {
            double mph = kilometersPerHour / 1.609d;
            return Math.round(mph);
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        if (kilometersPerHour >= 0) {
            double mph = kilometersPerHour / 1.609d;
            mph = Math.round(mph);
            System.out.println(kilometersPerHour + " km/h = " + (long)mph + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int remainder = kiloBytes % 1024;
        int mega = kiloBytes / 1024;
        System.out.println(kiloBytes + " KB = " + mega + " MB and " + remainder + " KB");
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23 || !isBarking) {
            return false;
        }
        if (hourOfDay < 8 || hourOfDay > 22) {
            return true;
        }
        return false;

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        one *= 1000;
        two *= 1000;
        if ((int)one == (int)two) {
            return true;
        }
        return false;
    }

    public static boolean hasEqualSum(int one, int two, int three) {
        if ((one + two) == three) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int one, int two, int three) {
        if (one >= 13 && one <=19) return true;
        if (two >= 13 && two <=19) return true;
        return (three >= 13 && three <=19);
    }

    public static boolean isTeen(int one) {
        return (one >= 13 && one <= 19);
    }

}
