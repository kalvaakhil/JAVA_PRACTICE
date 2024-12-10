import java.util.*;

public class ThreeSum {
    public static Set<List<Integer>> getTripleElementsSumToZero(int arr[]) {
        Set<List<Integer>> finallist = new HashSet<>();

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> ans = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(ans); // Sort the triplet to ensure uniqueness
                        finallist.add(ans);
                    }
                }
            }
        }
        return finallist;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        Set<List<Integer>> result = getTripleElementsSumToZero(arr);
        System.out.println("Triplets with sum zero: " + result);
    }
}
