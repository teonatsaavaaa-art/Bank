package org.example;
public class BankAccount {

    private double balance;


    public BankAccount(double balance) {
        this.balance = balance;
    }


    public void checkBalanceLimit() {
        if (balance < 100) {
            System.out.println("ბალანსი მწირეა");
        } else {
            System.out.println("ბალანსი საკმარისია");
        }
    }


    @Override
    public String toString() {
        return "მიმდინარე ბალანსი: " + balance;
    }
}
