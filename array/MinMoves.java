/*
 * problem :- Find minimum moves required for converting a given array to an array of zeroes

 */

package array;

public class MinMoves {
    public static int findMoves(int[] A) {
        int min_moves = 0;
        while (true) {
            int no_of_zeroes = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] % 2 == 1) {
                    --A[i];
                    ++min_moves;
                }
                if (A[i] == 0) {
                    no_of_zeroes++;
                }
            }
            if (no_of_zeroes == A.length) {
                break;
            }
            for (int j = 0; j < A.length; j++) {
                A[j] = A[j] / 2;
            }
            min_moves++;
        }
        return min_moves;
    }

    public static void main(String[] args) {
        int[] A = { 8, 9, 8 };
        System.out.println(findMoves(A));
    }
}
