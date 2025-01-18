package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Aria");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        boolean anyMatch = filteredNames.stream()
                .anyMatch(val->val.length()>10);

        System.out.println(filteredNames);
    }
}

