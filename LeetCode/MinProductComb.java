/*
 * problem :- Find minimum product among all combinations of triplets in an array
 * problem set :- Given an integer array, find the minimum product among all combinations of triplets in the array
 */

import java.util.Arrays;

public class MinProductComb {
    public static void minProduct(int[] A){
        int n = A.length;
        Arrays.sort(A);
        if(A[0]*A[1]*A[2]<A[0]*A[n-1]*A[n-2]){
            System.out.println("("+A[0]+","+A[1]+","+A[2]+")");
        }
        else{
            System.out.println("("+A[n-1]+","+A[n-2]+","+A[0]+")");
        }
    }
    public static void main(String[] args){
        int[] A = {4,-1,3,5,9};
        minProduct(A);
    }    
}
/*
 * time complexity :- O(nlogn);
 * space complexity :- O(1);
 */
