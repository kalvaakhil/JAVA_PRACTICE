package Java8;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbersInRange {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        List<Integer> primes = IntStream.rangeClosed(start, end) // Create a range
                .filter(PrimeNumbersInRange::isPrime) // Filter prime numbers
                .boxed() // Convert IntStream to Stream<Integer>
                .collect(Collectors.toList()); // Collect into a list
        System.out.println("Prime numbers between " + start + " and " + end + ": " + primes);
    }
}

