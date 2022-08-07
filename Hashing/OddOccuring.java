/*
 * problem :- Find the odd occurring element in an array in a single traversal
 * problem set :- Given an integer array, duplicates are present in it in a way that all duplicates appear an even number of times except one which appears an odd number of times. 
 * Find that odd appearing element in linear time and without using any extra memory.
 */

import java.util.Map;
import java.util.HashMap;

public class OddOccuring {
    public static void findOddElement(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey((A[i]))) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                System.out.println("odd occuring elements are :- " + key);
            }
        }
    }

    public static void main(String[] args) {
        int[] A = { 4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3 };
        findOddElement(A);
    }
}
/*
 * time complexity :- O(n+n);
 * space complexity :- O(n);
 */