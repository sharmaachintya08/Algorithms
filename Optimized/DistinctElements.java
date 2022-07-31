/*
 * problem :- Find the count of distinct elements in every subarray of size `k`
 * problem set :- Given an array and an integer k, find the count of distinct elements in every subarray of size k.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class DistinctElements {
    public static void distinctElements(List<Integer> elements, int k) {
        for (int i = 0; i <= elements.size() - k; i++) {
            Set<Integer> distinct = new HashSet<>();
            distinct.addAll(elements.subList(i, i + k));
            System.out.printf("the distinct elements from subarray :- (%d %d) is %d \n", i, i + k - 1, distinct.size());
        }
    }

    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(2, 1, 2, 3, 2, 1, 4, 5);
        int k = 5;
        distinctElements(elements, k);
    }
}
/*
 * time complexity :- O(n*k);
 * space complexity :- O(1*k);
 * k = 5;
 */