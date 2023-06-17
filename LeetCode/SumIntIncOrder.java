/*
 * problem :- Print all combinations of positive integers in increasing order that sums to a given number
 * problem set :- Write code to print all combinations of positive integers in increasing order that sum to a given positive number.
 */

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumIntIncOrder {
    public static void printCombinations(int[] nums, int i, int sum, int sum_left) {
        int prev_sum = (i > 0) ? nums[i - 1] : 1;
        for (int k = prev_sum; k <= sum; k++) {
            nums[i] = k;
            if (sum_left > k) {
                printCombinations(nums, i + 1, sum, sum_left - k);
            }
            if (sum_left == k) {
                System.out.println(Arrays.stream(nums).limit(i + 1).boxed().collect(Collectors.toList()));
            }
        }
    }

    public static void findCombination(int sum) {
        int[] nums = new int[sum];
        int starting_index = 0;
        printCombinations(nums, starting_index, sum, sum);
    }

    public static void main(String[] args) {
        int sum = 5;
        findCombination(sum);
    }
}
/*
 * time complexity :- O(2^n);
 */