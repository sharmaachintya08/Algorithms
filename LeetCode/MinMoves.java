package LeetCode;
/*
 * problem :- Find minimum moves required for converting a given array to an array of zeroes

 */


public class MinMoves {
    public static int findMoves(int[] A) {
        int min_moves = 0;
        while (true) {
            int no_of_zeroes = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] % 2 == 1) {
                    --A[i];//breakpoint
                    ++min_moves;//breakpoint
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
        return min_moves;//breakpoint
    }

    public static void main(String[] args) {//breakpoint
        int[] A = { 8, 9, 8 };
        System.out.println(findMoves(A));
    }
}
