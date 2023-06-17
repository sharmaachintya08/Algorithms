/*
 * problem :- Longest Consecutive Subsequence
 * problem set :- Given an integer array, find the length of the 
 * longest subsequence formed by the consecutive integers. 
 * The subsequence should contain all distinct values, and the character set 
 * should be consecutive, irrespective of its order.
 */

import java.util.Arrays;

public class LonConcequetiveSubSequence {
    public static int findSubsequence(int[] A) {
        Arrays.sort(A);
        int count = 1;
        int mCount = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] - A[i - 1] == 1) {
                count++;
                if (count > mCount) {
                    mCount = count;
                }
            } else {
                count = 1;
            }
        }
        return mCount;
    }

    public static void main(String[] args) {
        int[] A = { 2, 4, 6, 3, 7, 4, 8, 1 };
        System.out.println(findSubsequence(A));
    }
}
/*
 * time complexity :- O(nlogn+n);
 * space complexity :- O(1);
 */