package Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleQuestions1to5 {

    public static List<Integer> generateList() {
        return Stream.iterate(1, x -> x + 1).limit(200).toList();
    }

    public static void printEvenNumbers(List<Integer> list) {
        System.out.println("Even Numbers:");
        list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }

    public static void startsWithOne(List<Integer> list) {
        System.out.println("Numbers starting with 1:");
        List<Integer> result = list.stream()
                .map(String::valueOf)
                .filter(x -> x.charAt(0) == '1')
                .map(Integer::parseInt)
                .toList();
        result.forEach(System.out::println);
    }

    public static void findDuplicates(List<Integer> list) {
        System.out.println("Duplicate Elements:");
        Set<Integer> seen = new HashSet<>();
        list.stream().filter(x -> !seen.add(x)).forEach(System.out::println);
    }

    public static void findDuplicatesUsingGrouping(List<Integer> list) {
        System.out.println("Duplicate Elements (Using Grouping):");
        list.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));
    }

    public static void findFirstElement(List<Integer> list) {
        System.out.print("First Element: ");
        list.stream().findFirst().ifPresent(System.out::println);
    }

    public static void countElements(List<Integer> list) {
        System.out.print("Total Element Count: ");
        long count = list.stream().count();
        System.out.println(count);
    }

    public static void countElementsUsingReduce(List<Integer> list) {
        System.out.print("Total Element Count (Using Reduce): ");
        int count = list.stream().reduce(0, (a, b) -> a + 1);
        System.out.println(count);
    }

    public static void main(String[] args) {
        // Generate a list of numbers
        List<Integer> list = generateList();

        // Print even numbers
        printEvenNumbers(list);

        // Find numbers that start with 1
        startsWithOne(list);

        // Find duplicates
        List<Integer> dupList = Arrays.asList(1, 2, 3, 4, 4, 5, 5, 1, 2, 7);
        findDuplicates(dupList);

        // Find duplicates using grouping
        findDuplicatesUsingGrouping(dupList);

        // Find the first element
        findFirstElement(list);

        // Count total elements
        countElements(dupList);

        // Count total elements using reduce
        countElementsUsingReduce(dupList);
    }
}
