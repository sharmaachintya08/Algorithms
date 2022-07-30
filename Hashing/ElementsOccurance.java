/*
 * problem :- Group elements of an array based on their first occurrence
 * problem set:- Given an unsorted integer array containing many duplicate elements, rearrange it such that the same element appears together and the relative order of the first occurrence of each element remains unchanged.
 */

import java.util.HashMap;
import java.util.Map;

public class ElementsOccurance {
    public static void occurance(int[] A) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : A) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for (int i : A) {
            if (freq.containsKey(i)) {
                int n = freq.get(i);
                while (n-- != 0) {
                    System.out.println(i + "");
                }
            }
            freq.remove(i);
        }
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 1, 2, 1 };
        occurance(A);
    }
}
/*
 * time complexity :- O(n);
 * space complexity :- O(1);
 */