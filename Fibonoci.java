package basics;

import java.util.ArrayList;

class Fibanoci {
    
    // List to store Fibonacci numbers
    ArrayList<Integer> ans = new ArrayList<>();
    
    // Method to generate Fibonacci series up to 'end' elements
    public ArrayList<Integer> getFibonacciSeries(int end) {
        if (end <= 0) {
            return ans;
        } else if (end == 1) {
            ans.add(0); // Starting with 0 for Fibonacci series
            return ans;
        } else if (end == 2) {
            ans.add(0); // Starting with 0 for Fibonacci series
            ans.add(1); // Adding 1 as the second number
            return ans;
        } else {
            ans.add(0); // First Fibonacci number
            ans.add(1); // Second Fibonacci number
            // Generating the rest of the Fibonacci series
            for (int i = 2; i < end; i++) {
                ans.add(ans.get(i - 1) + ans.get(i - 2)); // sum of previous two numbers
            }
            return ans;
        }
    }
}

public class FibonociSeries {
    public static void main(String[] args) {
        Fibanoci fib = new Fibanoci();
        
        // Specify the number of Fibonacci terms
        int n = 10;  // For example, generate the first 10 Fibonacci numbers
        
        ArrayList<Integer> fibonacciSeries = fib.getFibonacciSeries(n);
        
        // Printing the Fibonacci series
        System.out.println("Fibonacci Series up to " + n + " terms: ");
        for (int num : fibonacciSeries) {
            System.out.print(num + " ");
        }
    }
}
