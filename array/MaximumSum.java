//Maximum Sum Subarray by kadens algorithm

package Algorithms.Arrays;

public class MaximumSum {
    static int findMax(int arr[]){
        int maxSum = 0;
        int curSum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            curSum += arr[i];
            if(curSum > maxSum){
                maxSum = curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        int arr[] = {2,1,-1,5,3};
        System.out.println(findMax(arr));
    }
}
