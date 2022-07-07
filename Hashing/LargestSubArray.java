//in this problem we have to find the largest sub array containing equal number of 0s and 1s
/**
    the logic of this problem is ,
        we will mark 0 as -1 and 1 as 1 
        we will use the hash table for the arrays index as the index
        and the sum as the identifying factor , if the sum of of the substring is equal we will subtract the substring from the next index of the same sum to the last index of that sum
        and check if the length of the substring is greater or smaller than the previous substrings 
        we are taking sum as the key
 */
//time complexity :- O(n)

import java.util.Map;
import java.util.HashMap;

class LargestSubArray{
    public static void SubArray(int[] nums){
        Map<Integer,Integer>map = new HashMap<>();
        map.put(0,-1); //starting point where the len = 0 and index is -1
        int len = 0;
        int ending_index = -1;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += (nums[i]==0)?-1:1;
            if(map.containsKey(sum)){
                if(len<i-map.get(sum)){
                    len = i - map.get(sum);//this index will be the index which came earlier with the same sum
                    ending_index = i;
                }
            }
            else{
                map.put(sum,i);
            }
        }
        if(ending_index != -1){
            System.out.println("["+(ending_index -len+1)+","+ending_index+"]");
        }
        else{
            System.out.println("no subarray exists");
        }
    }
    public static void main(String[] args){
        int[] nums = {0,0,1,0,1,0,0};
        SubArray(nums);
    }
}