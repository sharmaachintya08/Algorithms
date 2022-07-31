/*
 * problem :- Partition an array into two subarrays with the same sum
 * problem set:- Given an integer array, partition it into two subarrays having the same sum of elements.
 */

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SameSumSubarray {
    public static void printArray(int[] A, int low, int high) {
        System.out.println(IntStream.range(low, high + 1).mapToObj(k -> A[k]).collect(Collectors.toList()));
    }

    public static int sumSubarray(int[] A) {
        int totalSum = Arrays.stream(A).sum();
        int sum_so_far = 0;
        for (int i = 0; i < A.length; i++) {
            if (sum_so_far == totalSum - sum_so_far) {
                return i;
            }
            sum_so_far += A[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = { 6, -4, -3, 2, 3 };
        int i = sumSubarray(A);
        if (i != -1) {
            printArray(A, 0, i - 1);
            printArray(A, i, A.length - 1);
        } else {
            System.out.println("array cant be partitioned");
        }
    }
}
/*
 * time complexity :- O(n);
 * space complexity :- O(1);
 */