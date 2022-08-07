/*
 * problem :- Left rotate an array
 */

import java.util.Arrays;

public class leftRotate {
    public static void rotate(int[] A, int k) {
        int n = A.length;
        if (n <= 2) {
            return;
        }
        int[] auxA = new int[n];
        for (int i = 0; i < k; i++) {
            auxA[i] = A[i];
        }
        for (int i = k; i < n; i++) {
            A[i - k] = A[i];
        }
        for (int i = n - k; i < n; i++) {
            A[i] = auxA[i - (n - k)];
        }
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        int k = 2;
        rotate(A, k);
        System.out.println(Arrays.toString(A));
    }
}
