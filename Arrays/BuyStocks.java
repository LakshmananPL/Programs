package com.codes.Arrays;

public class BuyStocks {
    public static void main(String[] args) {
        int[] stocks = {7,1,5,3,6,4};
        System.out.println(maxProfit(stocks));
    }
    public static int maxProfit(int[] stocks){
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int stock : stocks){
            if(stock<min){
                min = stock;
            }
            int profit = stock - min;
            if(max<profit){
                max = profit;
            }
        }
        return max;
    }
}
