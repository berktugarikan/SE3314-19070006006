package org.example;

public class Customer {
    private String name;
    private float balance;
    private float deposit;

    public Customer(String name, float balance, float deposit) {
        this.name = name;
        this.balance = balance;
        this.deposit = deposit;
    }


    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }
}
