//in this problem we have to sort the binary array in linear time 
//tha means its complexity should be O(n)

/**
 * constraints:-
 *              input: {1, 0, 1, 0, 1, 0, 0, 1}
 *              output: {0,0,0,0,1,1,1,1}
 */

import java.util.Arrays;
public class SortBinaryArray{
    public static void sort(int[] A){
        int k = 0;
        for(int i:A){
            if(i==0){
                k++;
            }
        }
        int index = 0;
        while(k!=0){
            A[index] = 0;
            index++;
            k--;
        }
        while(index<A.length){
            A[index] = 1;
        }
    }
    public static void main(String[] args){
        int[] A = {0,0,1,0,1,1,0,1,0,0};
        sort(A);
        //since arrays are passed as a reference 
        System.out.println(Arrays.toString(A));
    }
}