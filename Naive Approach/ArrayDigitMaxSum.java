/*
 * problem :- Find two numbers with maximum sum formed by array digits
 * problem set :- Given an integer array between 0 and 9, find two numbers with maximum sum formed using all the array digits. 
 * The difference in the number of digits of the two numbers should be ± 1.
 */

import java.util.Arrays;
import java.util.Collections;

public class ArrayDigitMaxSum {
    public static void maxSum(Integer[] A) {
        if (A.length <= 1) {
            return;
        }
        Arrays.sort(A, Collections.reverseOrder());
        int x = 0;
        for (int i = 0; i < A.length; i = i + 2) {
            x = x * 10 + A[i];
        }
        int y = 0;
        for (int i = 1; i < A.length; i = i + 2) {
            y = y * 10 + A[i];
        }
        System.out.println("the 2 numbers are :- " + x + " and " + y);
    }

    public static void main(String[] args) {
        Integer[] A = { 4, 6, 2, 7, 9, 8 };
        maxSum(A);
    }
}
/*
 * time complexity :- O(nlogn);
 * space complexity :- O(1);
 */
