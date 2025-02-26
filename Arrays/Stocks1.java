package com.codes.Arrays;

public class Stocks1 {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(findProfit(prices));
    }
    public static int findProfit(int[] prices){
        /*int ans = 0;
        for(int i=0; i<prices.length-1; i++){
            int j = i+1;
            while( j < prices.length && prices[i]<prices[j]){
                ans = Math.max(prices[j] - prices[i] , ans);
                j++;
            }
        }
        return ans;*/

        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(min>prices[i])
                min = prices[i];

            int currentProfit = prices[i] - min;
            if(currentProfit>profit){
                profit = currentProfit;
            }
        }
        return profit;
    }
}
