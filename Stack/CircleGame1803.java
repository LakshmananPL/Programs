package com.codes.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class CircleGame1803 {
    public static void main(String[] args) {
        System.out.println(findTheWinner(7, 2));
    }

    public static int findTheWinner(int n, int k) {

        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            int first = queue.peek();
            queue.poll();
            if (count == k) {
                count = 1;
            } else {
                queue.add(first);
                count++;
            }
        }
        return queue.peek();
    }
}
