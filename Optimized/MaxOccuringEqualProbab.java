import java.util.Map;

/*
 * problem :- Find an index of the maximum occurring element with equal probability
 * problem set :- Given a non-empty integer array, find the index of the maximum occurring element with an equal probability.
 */

import java.util.*;

public class MaxOccuringEqualProbab {
    public static int rand(int min, int max) {
        if (min > max || (max - min + 1 > Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("invalid range");
        }
        return new Random().nextInt(max - min + 1) + min;
    }

    public static int findIndex(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        int max_occuring = nums[0];
        for (int i : nums) {
            if (count.get(max_occuring) < count.get(i)) {
                max_occuring = i;
            }
        }
        int k = rand(1, count.get(max_occuring));
        int index = 0;
        while (k != 0 && index < nums.length) {
            if (nums[index] == max_occuring) {
                k--;
            }
            index++;
        }
        return index - 1;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 6, 8, 4, 6, 2, 4, 5, 9, 7, 4 };
        for (int i = 0; i < 5; i++) {
            System.out.println("index of max occuring element :- " + findIndex(nums));
        }
    }
}
/*
 * time complexity :- O(n);
 */