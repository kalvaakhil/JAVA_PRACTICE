package basics;

public class MissingNumberInSequence {
	    public static int findMissingNumber(int[] arr, int n) {
	        int totalSum = n * (n + 1) / 2;
	        int arrSum = 0;
	        for (int num : arr) {
	            arrSum += num;
	        }
	        return totalSum - arrSum;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 4, 5, 6};
	        int n = 6;
	        System.out.println("Missing number: " + findMissingNumber(arr, n));
	    }
}

