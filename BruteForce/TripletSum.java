/**
 * problem :- Find a triplet with the given sum in an array
 * problem set:- Given an unsorted integer array, find a triplet with a given sum in it.
 */

public class TripletSum {
    public static void tripletSum(int[] A,int target){
        for(int i=0;i<A.length-2;i++){
            for(int j=i+1;j<A.length-1;j++){
                for(int k=i+2;k<A.length;k++){
                    if(A[i]+A[j]+A[k] == target){
                        System.out.println(A[i]+" "+A[j]+" "+A[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        int[] A = {2, 7, 4, 0, 9, 5, 1, 3 };
        int target = 6;
        tripletSum(A,target);
    }
}
/**
 * time complexity :- O(n^3);
 * space complexity :- O(n);
 */
