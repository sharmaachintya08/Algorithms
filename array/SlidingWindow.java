/**
    problem :- Given an integer array, find the minimum sum subarray of size k, where k is a positive integer.
 */

class SlidingWindow{
    public static void subArray(int[] A,int k){
        if(A.length==0||A.length<=k){
            return ;
        }
        int window_sum = 0;
        int min_window = Integer.MAX_VALUE;
        int last = 0;
        for(int i =0;i<A.length;i++){
            window_sum += A[i];
            if(i+1>=k){
                if(min_window>window_sum){
                    min_window = window_sum ;
                    last = i;
                }
                window_sum -=A[i+1-k];
            }
        }
        System.out.printf("(%d , %d)",last-k+1,last);
    }
    public static void main(String[] args){
        int[] arr = {10,4,2,5,6,3,8,1};
        int k = 3;
        subArray(arr,k);
    }
}