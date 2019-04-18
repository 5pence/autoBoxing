package com.spencer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

	    boolean quit = false;
	    int choice = 0;
	    printInstructions();
	    while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGrocryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item on the list.");
        System.out.println("\t 5 - To search for an item on the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void  addItem() {
        System.out.print("Please enter the grocery Item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item string to modify: ");
        String item = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modilfyGroceryItem(item, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item string to remove: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.print("Enter the item string you wish to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("found " + searchItem + " in the grocery list");
        } else {
            System.out.println("That item is not on the list.");
        }
    }

    public static void  processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int averageValue = 0;

        boolean isNumber = true;
        while (isNumber){
            System.out.println("Enter the number: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                System.out.println(sum += number);
                System.out.println(averageValue+=1);
                System.out.println(average= sum/(averageValue));
            }
            else {
                isNumber = false;
                break;
            }

        }
        System.out.println("SUM = "+sum+" AVG = "+average);
        scanner.close();
    }
}
