/**
 * problem :- Find a triplet with the given sum in an array
 * problem set :- Given an unsorted integer array, find a triplet with a given sum in it.
 */

import java.util.Arrays;

public class TripletSum {
    public static void tripletSum(int[] A,int target){
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            int k = target - A[i];
            int low = i+1;
            int high = A.length - 1;
            while(low<high){
                if((A[low]+A[high])<k){
                    low++;
                }
                else if((A[low]+A[high]>k)){
                    high --;
                }
                else{
                    System.out.println(A[i]+""+A[low]+""+A[high]);
                    low++;
                    high--;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] A = {2, 7, 4, 0, 9, 5, 1, 3};
        int target = 6;
        tripletSum(A,target);
    }
}
/**
 * tc :- O(n^2);
 */
