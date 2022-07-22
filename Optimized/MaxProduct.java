/**
    problem :- Given an integer array, find the subarGiven an integer array, find the subarray that has the maximum product of its elements. The solution should return the maximum product of elements among all possible subarrays.
 */

class MaxProduct{
    public static int maxProduct(int[] A){
        if(A.length == 0){
            return 0;
        }
        int max_ending = A[0],min_ending = A[0];
        int max_so_far = A[0];
        for(int i=1;i<A.length;i++){
            int temp = max_ending;
            max_ending = Integer.max(A[i],Integer.max(A[i]*max_ending,A[i]*min_ending));
            min_ending = Integer.min(A[i],Integer.min(A[i]*temp,A[i]*min_ending));
            max_so_far = Integer.max(max_so_far,max_ending);
        }
        return max_so_far;
    }
    public static void main(String[] args){
        int[] A = {-2, 1, 5,3, 6,-8};
        System.out.println(maxProduct(A));
    }
}