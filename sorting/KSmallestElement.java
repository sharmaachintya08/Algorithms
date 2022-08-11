/*
 * problem :- Find k’th smallest element in an array
 * problem set :- Given an integer array, find k'th smallest element in the array 
 * where k is a positive integer less than or equal to the length of array.
 */

import java.util.Arrays;

public class KSmallestElement {
    public static int kSmallestElement(int[] A, int k) {
        Arrays.sort(A);
        if (A.length < k) {
            return -1;
        }
        return A[k-1];
    }

    public static void main(String[] args) {
        int[] A = { 7, 4, 6, 3, 9, 1 };
        int k = 3;
        int res = kSmallestElement(A, k);
        if (res == -1) {
            System.out.println("smallest element not found");
        } else {
            System.out.println(res);
        }
    }
}
