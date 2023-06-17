package LeetCode;
/*
 * problem :- Replace each array element by its corresponding rank
 * problem set:- Given an array of distinct integers, replace each array element by its corresponding rank in the array.
 */

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ElementRank {
    public static void arrayRanked(int[] A){
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<A.length;i++){
            map.put(A[i],i);
        }
        int rank = 0;
        for(int j : map.values()){
            A[j] = ++rank;
        }
    }
    public static void main(String[] args){
        int[] A = {10,8,15,12,6,20,1};
        arrayRanked(A);
        System.out.println(Arrays.toString(A));
    }
}
