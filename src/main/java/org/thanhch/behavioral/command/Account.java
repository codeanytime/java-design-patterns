package org.thanhch.behavioral.command;

/**
 * @author thanhch
 * <p>
 * Date: 15/04/2024
 * <p>
 * Class: Account
 */
public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " +amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdraw: " + amount);
    }
}
