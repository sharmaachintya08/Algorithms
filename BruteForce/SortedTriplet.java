/*
 * problem :- Find the sorted triplet in an array
 * problem set :- Given an integer array A, efficiently find a 
 * sorted triplet such that A[i] < A[j] < A[k] and 0 <= i < j < k < n, where n is the array size.
 */

public class SortedTriplet {
    public static void sortedTriplet(int[] A) {
        int n = A.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 1; j++) {
                for (int k = 0; k < n; k++) {
                    if (A[k] > A[j] && A[j] > A[i]) {
                        System.out.println("( " + A[i] + "," + A[j] + "," + A[k] + " )");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = { 5, 4, 3, 7, 6, 1, 9 };
        sortedTriplet(A);
    }
}
