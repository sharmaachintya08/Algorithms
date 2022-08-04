/*
 * problem :- Shuffle an array according to the given order of elements
 * problem set :- Given an array of distinct integers, shuffle it according to the given order of elements
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShuffleElements {
    public static void shuffleArray(int[] nums, int[] pos) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(pos[i], nums[i]);
        }
        for (var entry : map.entrySet()) {
            nums[entry.getKey()] = entry.getValue();
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] pos = { 3, 2, 4, 1, 0 };
        shuffleArray(nums, pos);
        System.out.println(Arrays.toString(nums));
    }
}
/*
 * time complexity :- O(n);
 * space complexity :- O(n);
 */
