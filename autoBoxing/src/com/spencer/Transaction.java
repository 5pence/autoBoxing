package com.spencer;

public class Transaction {

    private Customer customer;
    private double deposit, withdraw;

    public Transaction(Customer customer, double deposit, double withdraw) {
        this.customer = customer;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
