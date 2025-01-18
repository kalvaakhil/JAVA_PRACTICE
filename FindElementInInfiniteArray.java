package Java8;

import static java.util.Arrays.binarySearch;

public class FindElementInInfiniteArray {
    public static void main(String[] args) {

        int arr[]={3,5,7,9,12,15,18,21,24,27,32};

//        target=35;
//        l-8 h-16
        int target=21;
        int index=findIndex(arr,target);
//        int ind2=binarySearch(arr,21);
//        System.out.println(ind2);
        System.out.println(index);
    }

    private static int findIndex(int[] arr, int target) {
        int low=0;
        int high=1;
        while(true)
        {
            try{
                if(arr[high]>=target)
                {
                    break;
                }
                else{
                    low=high;
                    high=2*high;
                }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                break;
            }
        }
//        4 and 8
        return binarySearchFind(arr,target,low,high);

    }

    private static int binarySearchFind(int[] arr, int target, int low, int high) {
        while(low<=high)
        {
            int mid=(low+high)/2;
            try{
                if(arr[mid]==target)
                {
                    return mid;
                }
                else if(arr[mid]>target)
                {
                    high=low-1;
                }
                else{
                    low=mid+1;
                }
            }
            catch(ArithmeticException e){
                high=mid-1;
            }
        }
        return -1;
    }
}
