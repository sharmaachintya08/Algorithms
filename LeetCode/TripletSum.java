package LeetCode;
/**
 * problem :- Find a triplet with the given sum in an array
 * problem set:- Given an unsorted integer array, find a triplet with a given sum in it.
 */

import java.util.Map;
import java.util.HashMap;

public class TripletSum {
    public static boolean tripletSum(int[] A,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            map.put(A[i],i);
        }
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                int val = target - (A[i]+A[j]);
                if(map.containsKey(val)){
                    if(map.get(val)!=i&&map.get(val)!=j){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] A = {2,7,4,0,9,5,1,3};
        int target = 6;
        boolean ans = tripletSum(A,target);
        if(ans==true){
            System.out.println("triplet exists");
        }
        else{
            System.out.println("triplet doesnot exists");
        }
    }
}
/**
 * time complexity :- O(n+n^2);
 * space complexity :- O(n);
 */
