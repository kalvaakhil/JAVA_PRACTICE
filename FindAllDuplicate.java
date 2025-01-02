import java.util.Arrays;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,1,2,5,7,1};
        Arrays.sort(arr);
        int prev=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j] && prev!=arr[i])
                {
                    prev=arr[i];
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

    }
}
