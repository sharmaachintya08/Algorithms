/*
 * problem :- Partition an array into two subarrays with the same sum
 * problem set :- Given an integer array, partition it into two subarrays having the same sum of elements.
 */

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SameSumSubarray {
    public static void printArray(int[] A,int i,int j){
        System.out.println(IntStream.rangeClosed(i,j).mapToObj(k->A[k]).collect(Collectors.toList()));
    }
    public static int sameSum(int[] A){
        for(int i=0;i<A.length;i++){
            int leftSum = 0;
            for(int j=0;j<i;j++){
                leftSum += A[j];
            }
            int rightSum = 0;
            for(int j=i;j<A.length;j++){
                rightSum += A[j];
            }
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] A = {6,-4,-3,2,3};
        int i = sameSum(A);
        if(i!=-1){
            printArray(A,0,i-1);
            printArray(A,i,A.length-1);
        }
        else{
            System.out.println("the array cant be partitioned");
        }
    }
}
