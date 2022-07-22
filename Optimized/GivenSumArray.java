/**
    problem :- Given an integer array, find a subarray having a given sum in it.
 */

class GivenSumArray{
    public static void sumArray(int[] A, int target){
        int windowSum = 0;
        int high = 0;
        for(int low = 0; low < A.length ; low++){
            while(high<A.length&&windowSum < target){
                windowSum += A[high];
                high ++;
            }
            if(windowSum == target){
                System.out.printf("%d %d\t",low,high-1);
                return ;
            }
            windowSum -= A[low];
        }
    }
    public static void main(String[] args){
        int[] A = {-1,2,5,1,0,6,4,-2};
        int target = 5;
        sumArray(A,target);
    }
}
/**
 * time complexity :- O(n);
 * space complexity :- O(1);
 */