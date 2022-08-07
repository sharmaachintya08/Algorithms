/*
 * problem :- Find the frequency of each element in a sorted array containing duplicates
 * problem set :- Given a sorted array containing duplicates, efficiently find each element’s frequency without traversing the whole array.
 */

import java.util.Map;
import java.util.HashMap;

public class FrequencyElement {
    public static void findFrequency(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }

    public static void main(String[] args) {
        int[] A = { 2, 2, 2, 4, 4, 4, 5, 5, 6, 8, 8, 9 };
        findFrequency(A);
    }
}
