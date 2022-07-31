/*
 * problem :- Find the minimum index of a repeating element in an array
 * problem set :- Given an integer array, find the minimum index of a repeating element 
 * in linear time and doing just a single traversal of the array.
 */

import java.util.Set;
import java.util.HashSet;

public class MinIndex {
    public static int findminIndex(int[] A) {
        Set<Integer> set = new HashSet<>();
        int minIndex = Integer.MAX_VALUE;
        for (int i = A.length - 1; i >= 0; i--) {
            if (set.contains(A[i])) {
                minIndex = i;
            } else {
                set.add(A[i]);
            }
        }
        if (minIndex == Integer.MAX_VALUE) {
            minIndex = -1;
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] A = { 5, 6, 3, 4, 3, 6, 4 };
        int minIndex = findminIndex(A);
        if (minIndex == A.length) {
            System.out.println("invalid result");
        } else {
            System.out.println("the minimum index for the repeatable element is :- " + minIndex);
        }
    }
}
/*
 * time complexity :- O(n);
 * space complexity :- O(n);
 */
