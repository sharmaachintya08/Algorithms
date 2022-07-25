/**
 * problem :- Sort an array in one swap whose two elements are swapped
 * problem set:-  Given an array where all its elements are sorted in increasing order except two swapped elements,
 *                sort it in linear time. Assume there are no duplicates in the array
 */

import java.util.Arrays;
public class OneSwapSort {
    public static void swap(int x,int y ,int[] A){
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
    public static void oneSwap(int[] A){
        int x = -1 , y = -1;
        for(int i = 1;i < A.length ;i++){
            if(A[i-1]>A[i]){
                if(x==-1){
                    x = i-1;
                    y = i;
                }
                else{
                    y = i;
                }
            }
        }
        swap(x,y,A);
    }
    public static void main(String[] args){
        int[] A = {3,8,6,7,5,9};
        oneSwap(A);
        System.out.println(Arrays.toString(A));    
    }
}
