package org.example;
public class BankAccount {

    private double balance;

    // კონსტრუქტორი
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // ბალანსის შემოწმება
    public void checkBalanceLimit() {
        if (balance < 100) {
            System.out.println("ბალანსი მწირეა");
        } else {
            System.out.println("ბალანსი საკმარისია");
        }
    }

    // toString override
    @Override
    public String toString() {
        return "მიმდინარე ბალანსი: " + balance;
    }
}
