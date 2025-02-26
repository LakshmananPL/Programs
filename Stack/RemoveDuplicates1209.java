package com.codes.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class RemoveDuplicates1209 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("deeedbbcccbdaa", 3));
    }

    public static String removeDuplicates(String string, int k) {
        Deque<Character> deque = new ArrayDeque<>();
        Stack<Integer> counter = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (deque.isEmpty()) {
                deque.add(ch);
                counter.push(1);
            } else {
                if (deque.peekLast().equals(string.charAt(i))) {
                    deque.add(ch);
                    counter.push(counter.peek()+1);
                    if (counter.peek() == k) {
                        for (int j = 0; j < k; j++) {
                            deque.removeLast();
                            counter.pop();
                        }
                    }
                } else {
                    deque.add(ch);
                    counter.push(1);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!deque.isEmpty()) {
            stringBuilder.append(deque.pop());
        }
        return stringBuilder.toString();
    }
}
