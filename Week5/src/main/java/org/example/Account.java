package org.example;

public class Account {
    /***
     * add amount of money to customer's balance.
     * @param customer
     * @param amount
     */
    public void depositMoney(Customer customer, float amount){
        customer.setBalance(customer.getBalance() + amount);
        System.out.println("Your new balance is : " + customer.getBalance());
    }

    /***
     * withdraw money from customer's account. Amount is amount.
     * @param customer
     * @param amount
     */
    public void withdrawMoney(Customer customer, float amount){
        if ((customer.getBalance()) < amount){
            System.out.println("Your balance is not enough! Your balance is: " + customer.getBalance());
        }
        else{
            customer.setBalance(customer.getBalance()-amount);
            System.out.println("New balance is " + customer.getBalance());
        }
    }

    /***
     * Prints customer balance and name
     * @param customer
     */
    public void checkBalance(Customer customer){
        System.out.println(customer.getName() + "'s balance is: " + customer.getBalance());
    }
}
