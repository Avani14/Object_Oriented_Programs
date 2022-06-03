package com.commercialDataProcessing;

import java.util.Date;

import static com.commercialDataProcessing.StockAccount.arrayOfCompanyShares;


public class Transaction extends CompanyShares implements ITransaction{

    public Transaction(String stockSymbol, int numberOfShares, Date time) {
        super(stockSymbol, numberOfShares, time);
    }

    @Override
    public double valueOf() {
        return 0;
    }

    @Override
    public void buy(int amount, String symbol) {
        if(amount>numberOfShares)
        {
            System.out.println("The shares are not sufficient");
        }
        else {
            numberOfShares-=amount;
            time = new Date();
            System.out.println("You bought " + amount + " worth of shares of " + symbol);
        }

    }

    @Override
    public void sell(int amount, String symbol) {
        numberOfShares+=amount;
        time = new Date();
        System.out.println("You sold "+amount+" worth of shares of "+symbol);
    }

    @Override
    public void save(String filename) {

    }

    @Override
    public void printReport() {
        for(CompanyShares cs : arrayOfCompanyShares)
        {
            System.out.println(cs);
        }
    }
}
