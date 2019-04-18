package com.spencer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"Japan");
        addInOrder(placesToVisit,"Java");
        addInOrder(placesToVisit,"Berlin");
        addInOrder(placesToVisit,"New York");
        addInOrder(placesToVisit,"Thailand");
        addInOrder(placesToVisit,"Switzerland");
        addInOrder(placesToVisit,"Moscow");
        addInOrder(placesToVisit,"Sweden");
        addInOrder(placesToVisit,"Dublin");
        addInOrder(placesToVisit,"Cork");
        addInOrder(placesToVisit,"Cork");
        printList(placesToVisit);
        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //equal, do not add
                System.out.println("This city is already included");
                return false;
            }
            if (comparison > 0) {
                //add it
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary.");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;

                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                        break;
                    }
                    System.out.println("Reached the end of the list.");
                    goingForward = false;
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now revisiting " + listIterator.previous());
                        break;
                    }
                    System.out.println("You are at the start of the list.");
                    goingForward = true;
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress: ");
        System.out.println("0 --> Quit");
        System.out.println("1 --> go to next city");
        System.out.println("2 --> go to previous city");
        System.out.println("3 --> print menu options");
    }
}
