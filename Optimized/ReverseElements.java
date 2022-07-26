/**
 * problem:-  Reverse every consecutive `m`-elements of a subarray
 * problem set:- Given an array, reverse every group of consecutive m elements in a given subarray of it
 */

public class ReverseElements {
    public static void swap(int Left,int Right,int[] A){
        int temp = A[Right];
        A[Right] = A[Left];
        A[Left] = temp;
    }
    public static void startReversing(int[] A,int k){
        for(int i=0;i<A.length;i=i+k){
            int Left = i;
            int Right = Math.min(i+k-1,A.length-1);
            while(Left<Right){
                swap(Left,Right,A);
                Left++;
                Right--;
            }
        }
    }
    public static void main(String[] args){
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        startReversing(A,k);
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
}
/*
 * tc :- o(n);
 */
