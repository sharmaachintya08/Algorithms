/*
 * problem :- Find duplicates within a range `k` in an array
 * problem set :- Given an array and a positive number k, check whether the array contains any duplicate elements within the range k. If k is more than the array’s 
 * size, the solution should check for duplicates in the complete array.
 */

import java.util.HashMap;
import java.util.Map;

public class DuplicatesWithinK {
    public static boolean findDuplicates(int[] A, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                if (i - map.get(A[i]) <= k) {
                    return true;
                }
            }
            map.put(A[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = { 5, 6, 8, 2, 4, 6, 9 };
        int k = 4;
        boolean result = findDuplicates(A, k);
        if (result) {
            System.out.println("duplicates exists");
        } else {
            System.out.println("duplicate does not exist");
        }
    }
}
/*
 * time complexity :- O(n);
 * space complexity :- O(n);
 */
