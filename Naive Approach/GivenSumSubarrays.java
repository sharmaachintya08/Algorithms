/*
 * problem :- Find subarrays with a given sum in an array
 * problem set :- Given an integer array, find subarrays with a given sum in it.
 */

import java.util.HashMap;
import java.util.Map;

public class GivenSumSubarrays {
    public static void sumSubarray(int[] A,int k){
        Map<Integer,Integer> map = new HashMap<>();
        int n = A.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += A[j];
                if(sum == k){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
    public static void main(String[] args){
        int[] nums = {3,4,-7,1,3,3,1,-4};
        int k = 7;
        sumSubarray(nums,k);
    }
}
/*
 * time complexity :- O(N^2);
 * space complexity :- O(1);
 */