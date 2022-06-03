package com.account;

import java.util.Scanner;

public class AccountDetails {
    private float balance;
    private float withdraw;


    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(float withdraw) {
        this.withdraw = withdraw;
    }

    public void setValues()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your current balance : ");
        float balance = sc.nextFloat();
        setBalance(balance);
        System.out.println("Please enter the amount you wish to debit : ");
        float withdraw = sc.nextFloat();
        setWithdraw(withdraw);
        Debit d = new Debit();
        d.checkBalance(balance,withdraw);
    }
}
