/*
 * problem :- Find two non-overlapping pairs having the same sum in an array
 * problem set :- Given an unsorted integer array, find two non-overlapping pairs in it having the same sum.
 */

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Pair {
    public int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class NonOverlappingPairs {
    public static void nonOverlappingPairs(int[] A) {
        Map<Integer, List<Pair>> map = new HashMap<>();
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int sum = A[i] + A[j];
                if (map.containsKey(sum)) {
                    for (Pair pair : map.get(sum)) {
                        int m = pair.x;
                        int n = pair.y;
                        if ((m != i && m != j) && (n != i) && (n != j)) {
                            System.out.printf("First Pair(%d,%d) \n", A[i], A[j]);
                            System.out.printf("Second Pair(%d,%d) \n", A[m], A[n]);
                            return;
                        }
                    }
                }
                map.putIfAbsent(sum, new ArrayList<>());
                map.get(sum).add(new Pair(i, j));
            }
        }
    }

    public static void main(String[] args) {
        int[] A = { 3, 4, 7, 3, 4 };
        nonOverlappingPairs(A);
    }
}
