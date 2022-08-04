import java.util.Arrays;

/*
 * problem :- Longest Alternating Subarray Problem
 * Problem set :- Given an array containing positive and negative elements, find a subarray with 
 * alternating positive and negative elements, and in which the subarray is as long as possible.
 */

import java.util.Arrays;

public class LonAlternatingSubarray {
    public static void alternatingSubarray(int[] A) {
        int currLen = 1;
        int maxLen = 0;
        int endIndex = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] * A[i] < 0) {
                currLen++;
                if (currLen > maxLen) {
                    maxLen = currLen;
                    endIndex = i;
                }
            } else {
                currLen = 1;
            }
        }
        int[] subarray = Arrays.copyOfRange(A, (endIndex - maxLen + 1), endIndex + 1);
        System.out.println(Arrays.toString(subarray));
    }

    public static void main(String[] args) {
        int[] A = { 1, -2, 6, 4, -3, 2, -4, -3 };
        alternatingSubarray(A);
    }
}
/*
 * time complexity :- O(n);
 * space complexity:- O(n);
 */