package com.codes.Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 1, 9, 2);

        int[] nums = {1,2,3,4,5,6,7,8,9};

        // Find maximum
        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow(() -> new RuntimeException("Empty list"));
        System.out.println("Max: " + max);

        // Find minimum
        int min = numbers.stream()
                .min(Integer::compareTo)
                .orElseThrow(() -> new RuntimeException("Empty list"));
        System.out.println("Min: " + min);

        System.out.println(numbers.stream().max((num1,num2) -> Integer.compare(num1, num2)).get());
        System.out.println(numbers.stream().max((num1,num2) -> num1.compareTo(num2)).get());
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);
        numbers.stream().mapToInt(integer -> integer.intValue()).sum();

        System.out.println(numbers.stream().mapToInt(n -> (int) n).sum());

        System.out.println(Arrays.stream(nums).max().getAsInt());

        //finding duplicates
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape", "apple");
        List<String> list1 =list.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter(entry -> entry.getValue()>1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        for (String string : list1){
            System.out.println(string);
        }
        Set<String> set = new HashSet<>();

        list.stream()
                .filter(string -> !set.add(string))
                .distinct()
                .forEach(System.out::println);
        list.stream().collect(Collectors.groupingBy(string -> string.length(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().forEach(entry -> {
                    System.out.println("Number" + entry.getKey() + "Count" + entry.getValue());
                });

        list.stream().collect(Collectors.groupingBy(String::length)).forEach((key, value) -> System.out.println("key:" + key + " value:" + value));

        list.stream().sorted((s1,s2) -> Integer.compare(s1.length(), s2.length())).forEach(System.out::println);
        list.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

    }
}
