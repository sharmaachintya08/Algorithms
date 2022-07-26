/*
 * problem :- Maximum Product Subset Problem
 * problem set :- Given an integer array, find the maximum product of its elements among all its subsets
 */

public class MaxProductSubset {
    public static int maxProduct(int[] A,int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return A[0]; 
        }
        int product = 1;
        int abs_min_so_far = Integer.MAX_VALUE;
        int negative = 0;
        int positive = 0;
        boolean contains_zero = false;
        for(int i=0;i<n;i++){
            if(A[i]<0){
                negative++;
                abs_min_so_far = Integer.min(abs_min_so_far,Math.abs(A[i]));
            }
            else if(A[i]>0){
                positive++;
            }
            if(A[i] == 0){
                contains_zero = true;
            }
            else{
                product = product * A[i];
            }
        }
        if(negative != 0){
            product = product /-abs_min_so_far;
        }
        if(negative == 1 && positive == 0 && contains_zero ){
            product = 0;
        }
        if(negative == 0 && positive == 0 && contains_zero){
            product = 0;
        }
        return product;
    }
    public static void main(String[] args){
        int[] A = {-6,4,-5,8,-10,0,8};
        System.out.println(maxProduct(A,A.length));
    }
}
/*
 * time complexity :- O(n);
 * space complexity :- O(1);
 */
