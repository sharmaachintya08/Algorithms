//subArray with given sum k

package Algorithms.Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SubarrayGivenSum {
    static void subArraySum(int arr[] , int sum){
        HashMap<Integer,Integer> map = new HashMap<>();
        int start = 0;
        int end = -1;
        int currSum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            currSum += arr[i];
            if(currSum - sum == 0){
                start = 0;
                end = i;  
                break ;          
            }
            if(map.containsKey(currSum - sum)){
                start = map.get(currSum - sum) + 1;
                end = i;
                break;
            }
            map.put(currSum,i);
        }
        if(end == -1){
            System.out.println("no subarray present");
        }else{
            System.out.println("range is from {"+start+","+end+"}");
        }
    }
    public static void main(String[] args){
        int arr[] = {10,15,-5,15,-10,5};
        int sum = 5;
        subArraySum(arr,sum);
    }
}
