package LeetCode;
/*
 * problem :- Check if an array represents a min-heap or not
 * problem set :- Given an integer array, check if it represents min-heap or not.
 */

public class CheckHeap {
    public static boolean checkMinHeap(int[] A, int i) {
        if (i * 2 + 2 > A.length) {
            return true;
        }
        boolean left = (A[i] <= A[2 * i + 1]) && checkMinHeap(A, i * 2 + 1);
        boolean right = (2 * i + 2 == A.length) || (A[i] <= A[2 * i + 2]) && checkMinHeap(A, i * 2 + 2);
        return left && right;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6 };
        int index = 0;
        if (checkMinHeap(A, index)) {
            System.out.println("this is a min heap");
        } else {
            System.out.println("this is not a min heap");
        }
    }
}
