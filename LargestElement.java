package basics;

import java.util.Arrays;

class Largest3Numbers {
    // Method to find the largest of three numbers
    public int largest3(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        }
        return c;
    }

    // Method to find the largest number in an array
    public int findLargestNumberInArray(int[] arr) {
        int max = Integer.MIN_VALUE; // Initialize with the smallest integer value
        for (int num : arr) {
            max = num > max ? num : max; // Update max if num is greater
        }
        return max;
    }
    
    public int findNthLargestInArray(int arr[],int n)
    {
    	if(n>arr.length || n<0)
    	{
    		throw new IllegalArgumentException("Illegal Value");
    	}
    	Arrays.sort(arr);
    	return arr[arr.length-n];
    }
}

public class LargestElement {

    public static void main(String[] args) {
        Largest3Numbers largest = new Largest3Numbers();

        // Finding the largest among three numbers
        int largestOfThree = largest.largest3(10, 20, 15);
        System.out.println("Largest of 10, 20, 15: " + largestOfThree);

        // Finding the largest number in an array
        int[] numbers = {1, 2, 3, 4, 1};
        int largestInArray = largest.findLargestNumberInArray(numbers);
        System.out.println("Largest in array {1, 2, 3, 4, 1}: " + largestInArray);
    }
}
