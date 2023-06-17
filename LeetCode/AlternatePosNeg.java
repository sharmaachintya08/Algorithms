/*
 * problem :- Rearrange an array such that it contains alternate positive and negative numbers
 * problem set :- Given an integer array, rearrange it such that it contains positive and negative numbers at alternate positions. If the array contains more positive or negative elements, move them to the 
 *                end of the array. Assume that all values in the array are non-zero.
 */

import java.util.Arrays;

public class AlternatePosNeg {
    public static int partition(int[] A){
        int pivot = 0;
        int j = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]<pivot){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;

                j++;
            }
        }
        return j;
    }
    public static void sort(int[] A){
        int p = partition(A);
        for(int i=0;(p<A.length&&i<p);i+=2,p++){
            int temp = A[i];
            A[i] = A[p];
            A[p] = temp;
        }
    }
    public static void main(String[] args){
        int[] A = {9, -3, 5, -2, -8, -6, 1, 3 };
        sort(A);
        System.out.println(Arrays.toString(A));
    }    
}
/*
 * time complexity :- O(N);
 * space complexity :- O(1);
 */
