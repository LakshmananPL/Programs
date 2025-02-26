package com.codes.Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "lax", "sivagangai"));
        students.add(new Student(2, "manan", "sivagangai"));
        students.add(new Student(3, "vicky", "vandhavasi"));
        students.add(new Student(4, "srini", "vandhavasi"));
        students.add(new Student(5, "karthi", "thirunalveli"));

        List<String> students1 =  students.stream()
                .map(Student::getName)
                .filter(name -> name.equalsIgnoreCase("lax")).collect(Collectors.toList());

        students.stream()
                .filter(student -> student.getName().equalsIgnoreCase("lax"))
                .map(Student::getAddress)
                .forEach(System.out::println);

        students.stream()
                .map(Student::getName)
                .filter(name -> name.equalsIgnoreCase("lax"))
                .forEach(System.out::println);


        FInterface fInterface = (a, b ,c) -> (a + b + c);

        System.out.println(fInterface.calculateSum(1,2,3));
        System.out.println();

        TreeSet<String> strings = new TreeSet<>((a, b) -> b.compareTo(a));
        TreeSet<String> strings1 = new TreeSet<>(Comparator.reverseOrder());

        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");

        Thread thread = new Thread(() -> System.out.println("hi"));
        thread.start();

        List<Integer> list
                = Arrays.asList(24, 346, 78, 90, 21, 765);

        list.sort((a1, a2) -> a1 % 10 > a2 % 10 ? 1 : -1);
        System.out.println(list);

        HashMap<Integer, String> hashMap = new HashMap<>();

        students.forEach(student -> hashMap.put(student.getRollNo(), student.getName()));
        System.out.println(hashMap);

        Map<Integer, Student> studentHashMap = students
                .stream()
                .collect(Collectors.toMap(Student::getRollNo, student ->  student));
        //System.out.println(studentHashMap);

        for (Map.Entry<Integer, Student> entry : studentHashMap.entrySet()){
            System.out.println(entry.getValue());
        }

        String string = "fdrgfd";
        System.out.println(string.chars().allMatch(Character::isLetter));


        //myStream.filter(x -> x.matches("(a|e|i|o|u)\\w*"))
        //            .forEach(System.out::println);

        ArrayList list1 = new ArrayList<>(Arrays.asList(1,2,1,45,2));
        list1.stream()
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);


        Stream<String> stream = Stream.of("GFG", "Geeks",
                "for", "GeeksforGeeks");

        stream.sorted(Comparator.reverseOrder())
                .flatMap(str -> Stream.of(str.charAt(1)))
                .forEach(System.out::println);
        ArrayList<String> strings2 = new ArrayList<>(Arrays.asList("GFG", "Geeks",
                "for", "GeeksforGeeks"));

        strings2.stream().
                flatMap(string1 -> string1.chars().mapToObj(c -> (char) c)).sorted()
                .forEach(System.out::println);

        //1. Find Even Numbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90);
        System.out.println("1. Find Even Numbers");
        numbers.stream().filter(num -> (num&1)==0).forEach(System.out::println);
        //2. Find Unique Elements
        System.out.println("2. Find Unique Elements");
        numbers.stream().filter(x -> Collections.frequency(numbers,x)==1).forEach(System.out::println);
        //3. Sort a List of Strings by Length
        System.out.println("3. Sort a List of Strings by Length");
        List<String> stringss = Arrays.asList("madam", "banana", "pear", "kiwi", "grape", "apple");
        List<String> stringsss = Arrays.asList("madam", "banana", "pear", "kiwi", "grape", "apple", null, null);
        stringss.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        //4. Count Strings that Start with 'A'
        System.out.println("4. Count Strings that Start with 'A'" + stringss.stream()
                .filter(string1 -> string1.startsWith("a")).count());
        //5. Convert List of Strings to Uppercase
        System.out.println("5. Convert List of Strings to Uppercase");
        stringss.stream().map(String::toUpperCase).forEach(System.out::println);
        //6. Find the Maximum Element in a List
        System.out.println("6. Find the Maximum Element in a List" + numbers.stream().max(Comparator.naturalOrder()).get());
        //7. Concatenate Strings with a Delimiter
        System.out.println("7. Concatenate Strings with a Delimiter" + stringss.stream().collect(Collectors.joining(",")));
        //8. Find the First Element That Matches a Condition
        System.out.println("8. Find the First Element That Matches a Condition" + numbers.stream().filter(num -> num>50).findFirst().get());
        //9. Sum of Squares
        System.out.println("9. Sum of Squares" + numbers.stream().mapToInt(Integer::intValue).sum());
        //10. Group Strings by Their Length
        Map<Integer, List<String>> hashMap1 = strings.stream()
                .collect(Collectors.groupingBy(String::length));
        //11. Check if All Elements Match a Condition
        System.out.println("11. Check if All Elements Match a Condition" + numbers.stream().allMatch(num -> num>=0));
        //12. Remove Duplicates from a List
        System.out.println("12. Remove Duplicates from a List");
        numbers.stream().distinct().forEach(System.out::println);
        //13. Find the Longest String
        System.out.println("13. Find the Longest String");
        stringss.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(1).forEach(System.out::println);
        //14. Flatten a List of Lists
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        System.out.println("14. Flatten a List of Lists");
        List<Integer> integers = listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(integers);
        //15. Partition Strings Based on Length
        Map<Boolean, List<String>> listMap = stringss.stream()
                .collect(Collectors.partitioningBy(string1 -> string1.length()>4));
        System.out.println("15. Partition Strings Based on Length");
        System.out.println(listMap);
        //16. Find All Palindromes in a List of Strings
        System.out.println("16. Find All Palindromes in a List of Strings");
        stringss.stream().filter(Streams::isPalindrome).forEach(System.out::println);
        //17. Get the Top 3 Largest Numbers
        System.out.println("17. Get the Top 3 Largest Numbers");
        numbers.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).limit(3).forEach(System.out::println);
        //18. Map Strings to Their Lengths
        System.out.println("18. Map Strings to Their Lengths");
        Map<String,Integer> map = stringss.stream().collect(Collectors.toMap(string1 -> string1, String::length));
        System.out.println(map);
        //19. Sum of Odd Numbers
        System.out.println("19. Sum of Odd Numbers" + numbers.stream().filter(num -> (num&1)==1).mapToInt(Integer::intValue).sum());
        //20. Check if a List Contains Any Null Values
        System.out.println("20. Check if a List Contains Any Null Values" + stringsss.stream().anyMatch(Objects::isNull));

        //1. Find the Second Highest Number in a List
        System.out.println("1. Find the Second Highest Number in a List" + numbers.stream().sorted().skip(1).findFirst().get());
        //2. Group Employees by Department and Find the Highest Salary in Each Department
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 3000),
                new Employee("Bob", "IT", 5000),
                new Employee("Charlie", "HR", 4000),
                new Employee("Dave", "IT", 6000),
                new Employee("Eve", "Marketing", 4500)
        );
        Map<String, Optional<Employee>> map1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment , Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println("2. Group Employees by Department and Find the Highest Salary in Each Department");
        for (Map.Entry<String, Optional<Employee>> entry : map1.entrySet()){
            System.out.println(entry.getKey() + '-' + entry.getValue().get());
        }
        //3. Find All Permutations of Strings and Filter Palindromes
        /*Map<Department, Map<String, List<Employee>>> employeesByDeptAndPosition =
    employees.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment,
                                            Collectors.groupingBy(Employee::getPosition)));
        */
        /*Map<Department, List<String>> employeeNamesByDepartment =
    employees.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment,
                                            Collectors.mapping(Employee::getName, Collectors.toList())));

        */

        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        String s = "tree";
        System.out.println("sorting based on frequency");
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (Integer num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        int[] sorted =  Arrays.stream(nums)
                .boxed() // Convert int[] to Integer[]
                .sorted((a, b) -> {
                    int freqA = freq.get(a);
                    int freqB = freq.get(b);
                    if (freqA != freqB) {
                        return Integer.compare(freqA, freqB); // Sort by frequency in ascending order
                    } else {
                        return Integer.compare(b, a); // If frequencies are the same, sort by value in descending order
                    }
                })
                .mapToInt(Integer::intValue) // Convert back to int[]
                .toArray();
        for (int num : sorted){
            System.out.println(num);
        }
        HashMap<Character,Integer> freq1 = new HashMap<>();
        for (int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            freq1.put(ch, freq1.getOrDefault(ch,0)+1);
        }

       /* s.chars().mapToObj(c -> (char) c).sorted((a,b) -> {
            int c1 = freq1.get(a);
            int c2 = freq1.get(b);
            if(c1!=c2)
                return c2-c1;
            else
                a-b;
        })*/
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        int sum = integerList.stream().filter(num -> (num&1)!=0).map(num -> num*num).reduce(Integer::sum).get();
        System.out.println("sum is" + sum);
        String[] strings3 = {"public","static","void","main"};
        Arrays.stream(strings3).map(String::toUpperCase).filter(string1 -> string1.length()>4).sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
    private static boolean isPalindrome(String string){
        int start = 0;
        int end = string.length()-1;
        while (start<=end){
            if(string.charAt(start) == string.charAt(end)){
                start++;
                end--;
            }
            else
                return false;
        }
        return true;
    }
}
