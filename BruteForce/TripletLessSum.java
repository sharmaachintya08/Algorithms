/*
 * problem :- Print all triplets in an array with a sum less than or equal to a given number
 * problem set:- Given an unsorted integer array, print all triplets in it with sum less than or equal to a given number.
 */

import java.util.Arrays;

public class TripletLessSum {
    public static void tripletCheck(int[] A, int sum) {
        Arrays.sort(A);
        if(A.length < 3){
            return;
        }
        for (int j = 1; j < A.length - 1; j++) {
            int i = A[j - 1];
            int k = A[j + 1];
            while (true) {
                if (A[i] + A[j] + A[k] <= sum) {
                    System.out.println("[" + A[i] + "," + A[j] + "," + A[k] + "]");
                    k++;
                } else if (A[i] + A[j] + A[k] > sum) {
                    i--;
                }
                if (k == (A.length - 1) && i == 0 && (A[i] + A[j] + A[k] > sum)) {
                    break;
                }
                if (k == A.length) {
                    k = A.length - 1;
                }
                if (i < 0) {
                    i = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = { 2, 7, 4, 9, 5, 1, 3 };
        int sum = 10;
        tripletCheck(A, sum);
    }
}
