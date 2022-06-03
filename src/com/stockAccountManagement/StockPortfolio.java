package com.stockAccountManagement;

import java.util.ArrayList;

import static com.stockAccountManagement.Main.arrayOfStock;

public class StockPortfolio extends Stock implements IStockCalculation{

    static float stockVal;
    static int t;

    public StockPortfolio(String nameOfStock, int numberOfShares, float sharePrice,int t) {
        super(nameOfStock, numberOfShares, sharePrice);
        this.t = t;
    }


    @Override
    public void stockCalculation(String nameOfStock, int numberOfShares, float sharePrice) {
        stockVal = numberOfShares*sharePrice;
        System.out.println("The total stock value of "+nameOfStock+" is "+stockVal);


    }
    public void stockPortfolio()
    {
        System.out.println("All the details of stock are as follows");
        for(Stock s:arrayOfStock)
        {
            System.out.println(s);
        }

    }
}
