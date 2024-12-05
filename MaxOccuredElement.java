import java.util.HashMap;
import java.util.Map;

public class MaxOccuredElement {

    public static int maxOccured(int arr[]) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int num : arr) {
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        // Find the element with the maximum occurrence
        int maxCount = 0;
        int maxElement = arr[0];
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 5, 1, 3, 7, 1};
        int result = maxOccured(arr);
        System.out.println("The element that occurs the most is: " + result);
    }
}
