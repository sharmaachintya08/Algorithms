/*
 * problem :- Find the minimum difference between the index of two given elements present in an array
 * problem set :- Given an integer array nums and two integers x and y present in it, find the minimum absolute difference between indices of x and y in a single traversal of the array.
 */

public class IndexedDiff {
    public static int indexedDiff(int[] A, int x, int y) {
        int min_diff = Integer.MAX_VALUE;
        int n = A.length;
        int x_index = n;
        int y_index = n;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                x_index = i;
                if (y_index != n) {
                    min_diff = Integer.min(min_diff, Math.abs(x_index - y_index));
                }
            }
            if (A[i] == y) {
                y_index = i;
                if (x_index != n) {
                    min_diff = Integer.min(min_diff, Math.abs(x_index - y_index));
                }
            }
        }
        return min_diff;
    }

    public static void main(String[] args) {
        int[] A = { 1, 3, 5, 4, 8, 2, 4, 3, 6, 5 };
        int x = 2;
        int y = 5;
        int min_diff = indexedDiff(A, x, y);
        if (min_diff != Integer.MAX_VALUE) {
            System.out.println(min_diff);
        } else {
            System.out.println("invalid result");
        }
    }
}
