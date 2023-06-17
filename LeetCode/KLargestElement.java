/*
 * problem :- Find k’th largest element in an array
 * problem set :- Given an integer array, find k’th largest element in the array where k 
 * is a positive integer less than or equal to the length of array.
 */

import java.util.Arrays;
import java.util.Collections;

public class KLargestElement {
    public static int kLargestElement(Integer[] A, int k) {
        Arrays.sort(A, Collections.reverseOrder());
        if (A.length < k) {
            return -1;
        }
        return A[k - 1];
    }

    public static void main(String[] args) {
        Integer[] A = { 7, 4, 6, 3, 9, 1 };
        int k = 2;
        int res = kLargestElement(A, k);
        if (res == -1) {
            System.out.println("invalid");
        } else {
            System.out.println(res);
        }
    }
}
/*
 * time complexity :- O(nlogn);
 */
