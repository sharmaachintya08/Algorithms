/*
 * problem :- Replace every array element with the least greater element on its right
 * problem set :- Given an array of distinct integers, replace every element with the 
 * least greater element on its right or with -1 if there are no greater elements.
 */

import java.util.Arrays;

public class LeastGreaterElement {
    public static void greaterElement(int[] A){
        for(int i=0;i<A.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j=i+1;j<A.length;j++){
                if(A[j]<min&&A[j]>A[i]){
                    min = A[j];
                } 
            }
            A[i] = min;
        }
        for(int i=0;i<A.length;i++){
            if(A[i]==Integer.MAX_VALUE){
                A[i] = -1;
            }
        }
        System.out.println(Arrays.toString(A));
    }
    public static void main(String[] args){
        int[] A = {10,100,93,32,35,65,80,90,94,100};
        greaterElement(A);
    }
}
/*
 * time complexity :- O(n^2);
 * space complexity :- O(1);
 */