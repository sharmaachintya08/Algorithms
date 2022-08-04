/*
 * problem :- Count the number of strictly increasing subarrays in an array
 * problem set :- Given an integer array, count the total number of strictly increasing subarrays in it.
 */

public class IncSubarrayCount {
    public static int countSubarray(int[] A) {
        int len = 1;
        int count = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] < A[i]) {
                count += len++;
            } else {
                len = 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 4, 4, 5 };
        System.out.println(countSubarray(A));
    }
}
/*
 * time complexity :- O(N);
 * space complexity :- O(1);
 */