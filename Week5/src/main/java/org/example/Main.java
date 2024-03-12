package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Berktug", 1500,300);
        Customer customer1 = new Customer("Mehmet", 9999,3333);
        Customer customer2 = new Customer("Songul", 1976,250);
        System.out.println(customer.getBalance());
        Account account = new Account();
        Bank bank = new Bank();
        bank.createAccount(customer1);
        bank.createAccount(customer2);
        account.checkBalance(customer);
        account.withdrawMoney(customer,500);
        account.depositMoney(customer,555);
        account.checkBalance(customer);
        bank.printDetails();

    }
}