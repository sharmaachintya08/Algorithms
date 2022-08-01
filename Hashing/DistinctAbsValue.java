/*
 * problem :- Count distinct absolute values in a sorted array
 * problem set :- Given an array of sorted integers that may contain 
 * several duplicate elements, count the total number of distinct absolute values in it.
 */

import java.util.Set;
import java.util.HashSet;

public class DistinctAbsValue {
    public static void distinctValue(int[] A){
        Set<Integer> set = new HashSet<>();
        for(int i:A){
            set.add(Math.abs(i));
        }
        System.out.println(set.size());
    }
    public static void main(String[] args){
        int[] A = {-1,-1,0,1,1,1};
        distinctValue(A);
    }
}
/*
 * time complexity :- O(n);
 * space complexity :- O(n);
 */
