public class KthLargestElement {
    public static int findKthLargest(int arr[], int k) {
        int[] sortedArray = sortArray(arr); // Sort the array
        int uniqueCount=0;
        int prev=Integer.MIN_VALUE;
       for(int i=arr.length-1;i>=0;i--)
       {
           if(prev!=sortedArray[i])
           {
               uniqueCount++;
               prev=sortedArray[i];
           }
           if(uniqueCount==k)
           {
               return sortedArray[i];
           }
       }
       return -1;
    }

    private static int[] sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int index = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            if (index != -1) { // Swap if a smaller element is found
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5,5,7, 6,6, 4};
        int k = 2;

        int kthLargest = findKthLargest(arr, k);
        System.out.println("The " + k + "th largest element is: " + kthLargest);
    }
}
