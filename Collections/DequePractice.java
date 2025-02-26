package com.codes.Collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequePractice {
    public static void main(String[] args) {
        Deque<String> deque
                = new LinkedList<String>();

        deque.add("Element 1 (Tail)");
        deque.add("Element 2 (Head)");
        deque.add("Element 3 (Tail)");


        // Add at the first
        //deque.push("Element 4 (Head)");

        System.out.println(deque);

       /* // Add at the last
        deque.offer("Element 5 (Tail)");

        // Add at the first
        deque.offerFirst("Element 6 (Head)");

        System.out.println(deque + "\n");

        // We can remove the first element
        // or the last element.
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing "
                + "first and last: "
                + deque);*/
    }
}
