package LeetCode;
/**
    problem :- kadens algorithm is used to find the maximum sum subarray 
    with O(n) time complexity 
    this problem doesnt handle the case where all the elements inside the array is neg
 */

class Kadens{
    static int kadens(int[] A){
        int maxSum = 0;
        int currSum = 0;
        for(int i =0 ;i<A.length;i++){
            currSum += A[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum  = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(kadens(A));
    }
}