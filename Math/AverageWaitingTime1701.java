package com.codes.Math;

public class AverageWaitingTime1701 {
    public static void main(String[] args) {
        int[][] customers = {{5,2},{5,4},{10,3},{20,1}};
        System.out.println(findAvgTime(customers));
    }

    private static double findAvgTime(int[][] customers) {
        int startTime;
        int avgTime;
        int totalAvgTime = 0;
        int currentTime = 0;
        double ans;
        for (int i = 0; i < customers.length; i++) {
            if (currentTime > customers[i][0])
                startTime = currentTime;
            else {
                startTime = customers[i][0];
            }
            currentTime = startTime + customers[i][1];
            avgTime = currentTime - customers[i][0];
            totalAvgTime = totalAvgTime + avgTime;
        }
        ans = (double) totalAvgTime / customers.length;
        return ans;
        /* private static double findAvgTime(int[][] customers) {
        int totalAvgTime = 0;
        int currentTime = 0;

        for (int[] customer : customers) {
            int arrivalTime = customer[0];
            int serviceTime = customer[1];

            int startTime = Math.max(currentTime, arrivalTime);
            currentTime = startTime + serviceTime;

            int waitingTime = currentTime - arrivalTime;
            totalAvgTime += waitingTime;
        }

        return (double) totalAvgTime / customers.length;
    }
*/
    }
}
