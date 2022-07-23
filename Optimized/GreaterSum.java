/**
 * problem :- Given an array of positive integers, find the smallest subarray’s length whose sum of elements is greater than a given number k. 
 */

public class GreaterSum {
    public static int greaterSubarray(int[] A,int k){
        int windowSum = 0;
        int len = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0 ; right < A.length ; right++){
            windowSum += A[right];
            while(windowSum > k && left <= right){
                len = Integer.min(len,right - left+1);
                windowSum -= A[left];
                left++;
            } 
        }
        if(len == Integer.MAX_VALUE){
            return 0; 
        }
        return len; 
    }
    public static void main(String[] args){
        int[] A = {-2,1,3,4,5,4,6,-3};
        int k = 5;
        System.out.println(greaterSubarray(A,k));
    }    
}
/**
 * time complexity :- O(n);
 * space complexity :- O(1);
 */