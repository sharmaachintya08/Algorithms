/*
 * problem :- Find the minimum and maximum element in an array using minimum comparisons
 * problem set :- Given an integer array, find out the minimum and maximum element present using minimum comparisons.
 */

public class MinMaxElement {
    public static void findMinMax(int[] A) {
        int min = A[0];
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            } else if (A[i] < min) {
                min = A[i];
            }
        }
        System.out.println(min + "," + max);
    }

    public static void main(String[] args) {
        int[] A = { 5, 7, 2, 4, 9, 6 };
        findMinMax(A);
    }
}
