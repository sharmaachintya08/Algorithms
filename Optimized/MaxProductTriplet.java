/*
 * problem :- Find a triplet having the maximum product in an array
 * problem set :- Given an integer array, find a triplet having the maximum product.
 */

import java.util.Arrays;

public class MaxProductTriplet {
    public static void productTriplet(int[] A){
        int n = A.length;
        Arrays.sort(A);
        if(A[0]*A[1]*A[n-1]>A[n-1]*A[n-2]*A[n-3]){
            System.out.printf("the max product will be : (%d , %d , %d) ",A[0],A[1],A[n-1]);
        }
        else{
            System.out.printf("the max product will be : (%d , %d , %d) ",A[n-1],A[n-2],A[n-3]);
        }
    }
    public static void main(String[] args){
        int[] A = {-4,1,-8,9,6};
        productTriplet(A);
    }
}
