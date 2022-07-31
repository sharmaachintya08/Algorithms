/*
 * problem :- Print all subarrays of an array having distinct elements
 * problem set :- Given an integer array, print all maximum size subarrays having all distinct elements in them.
 */

import java.util.HashMap;
import java.util.Map;

public class DistinctElementSubarray {
    public static void printArr(int[] A, int i, int j, int n) {
        if (i < 0 || i > j || j >= n) {
            return;
        }
        for (int index = i; index < j; index++) {
            System.out.print(A[index] + ", ");
        }
        System.out.println(A[j]);
    }

    public static void calculate(int[] A) {
        int n = A.length;
        Map<Integer, Boolean> visited = new HashMap<>();
        for (int val : A) {
            visited.put(val, false);
        }
        int right = 0, left = 0;
        while (right < n) {
            while (right < n && !visited.get(A[right])) {
                visited.put(A[right], true);
                right++;
            }
            printArr(A, left, right - 1, n);
            while (right < n && visited.get(A[right])) {
                visited.put(A[right], false);
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = { 5, 2, 3, 5, 4, 3 };
        calculate(A);
    }
}
/*
 * time complexity :- O(n);
 * space complexity :- O(n);
 */
