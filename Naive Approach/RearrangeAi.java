/*
 * problem :- Rearrange array such that `A[A[i]]` is set to `i` for every element `A[i]`
 * problem set:- Given an unsorted integer array A of size n, whose elements lie in the range 0 to n-1,
 * rearrange the array such that A[A[i]] is set to i for every array element A[i]. Do this in linear time 
 * and without using any extra constant space.
 */

public class RearrangeAi {
    public static void rearrange(int[] A){
        int[] auxA = new int[A.length];
        for(int i=0;i<A.length;i++){
            if(A[i]>A.length){
                auxA[i] = A[i];
            }
            auxA[i] = A[A[i]];
            System.out.println(auxA[i]);
        }
    }
    public static void main(String[] args){
        int[] A = {1,3,4,2,0};
        rearrange(A);
    }
}
/*
 * time complexity :- O(n);
 * space complexity :- O(1);
 */
