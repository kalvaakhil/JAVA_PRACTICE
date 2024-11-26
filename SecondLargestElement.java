
package basics;

public class SecondLargestElement {
    
    public int findSecondLargestElement(int arr[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num != first && num > second) {
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        SecondLargestElement obj = new SecondLargestElement();
        
        int[] array = {12, 35, 1, 10, 34, 1};  // Test case
        int secondLargest = obj.findSecondLargestElement(array);
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}
