package com.spencer;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("National Ballymoney Bank");

        if(bank.addBranch("Ballymoney")) {
            System.out.println("Ballymoney branch created");
        }

        bank.addCustomer("Ballymoney", "Tim", 50.05);
        bank.addCustomer("Ballymoney", "Mike", 175.34);
        bank.addCustomer("Ballymoney", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Ballymoney", "Tim", 44.22);
        bank.addCustomerTransaction("Ballymoney", "Tim", 12.44);
        bank.addCustomerTransaction("Ballymoney", "Mike", 1.65);

        bank.listCustomers("Ballymoney", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("Ballymoney")) {
            System.out.println("Ballymoney branch already exists");
        }

        if(!bank.addCustomerTransaction("Ballymoney", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Ballymoney", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }
    }
}
