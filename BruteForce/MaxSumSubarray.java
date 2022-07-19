/**
    problem :- Given an integer array, find a contiguous subarray within it that has the largest sum.
 */

class MaxSumSubarray{
    static int sumSubarray(int[] A){
       int maxSum = 0;
       for(int i=0;i<A.length;i++){
        for(int j=i;j<A.length;j++){
            int sum = 0;
            for(int k=i;k<=j;k++){
                sum = A[k];
            }
            if(sum >maxSum){
                maxSum = sum;
            }
        }
       } 
       return maxSum;
    }
    public static void main(String[] args){
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sumSubarray(array));
    }
}
/**
    time complexity = O(n^3)
    space complexity = O(1);
 */