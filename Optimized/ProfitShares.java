/**
 *  problem :- Find maximum sum path involving elements of given arrays
 *  problem set:- Given two sorted arrays of integers, find a maximum sum path involving elements of both arrays whose sum is maximum. 
 *                We can start from either array, but we can switch between arrays only through its common elements.
 */

public class ProfitShares {
    static int maxProfit(int[] A){
        int maxProfit = 0;
        int max = A[A.length - 1];
        int[] auxA  = new int[A.length];
        for(int i = A.length - 1;i >= 0;i--){
            if(A[i]>max){
                max = A[i];
                auxA[i] = max;
            }
            else{
                auxA[i] = max;
            }
        }
        for(int i=0;i<A.length;i++){
            if((auxA[i]-A[i])>maxProfit){
                maxProfit = auxA[i] - A[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int[] A = {1,5,7,3,4,6,8};
        System.out.println(maxProfit(A));
    }    
}
/**
 * time complexity :- O(n); (O(n+n))
 * space complexity :- (1);
 */