package org.example;

import java.util.ArrayList;

public class Bank {
    ArrayList<Customer> customers = new ArrayList<>();

    /***
     * Crate customer.
     * @param customer
     */
    void createAccount(Customer customer){
        customers.add(customer);
        System.out.println(customer.getName() + " is crated!");
    }

    /***
     * prints customers that created.
     */
    void printDetails(){
        for (int i = 0 ; i < customers.size() ; i++){
            String currentCustomer = customers.get(i).getName();
            float currentCustomerBalance = customers.get(i).getBalance();

            System.out.println("Retrieve account: " + currentCustomer + "'s balance is " + currentCustomerBalance );
        }
    }


}
