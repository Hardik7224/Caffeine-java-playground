package dsa.arrays;
/*
Stock Buy and Sell - Max one Transaction Allowed

Given an array prices[] of non-negative integers, representing the prices of the stocks on
different days, return the maximum profit possible by buying and selling the stocks
on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell.
If it is not possible to make a profit then return 0.
 */

import java.lang.Math;
public class StockBuyAndSell{

    public static int maxProfit(int[] prices){
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int buy = prices[i];

            for (int j = i + 1; j < prices.length; j++) {
                int sell = prices[j];
                max = Math.max(max, sell - buy);
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}