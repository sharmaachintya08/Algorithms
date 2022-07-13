/**
    Problem :- 
        Replace every array element with the product of every other element without using a division operator
 */

import java.util.Arrays;
class ElementProduct{
    static void elementProduct(int[] A,int n,int left,int i){
        if(i==n){
            return 1;
        }
        int curr = A[i];
        int right = elementProduct(A,n,left*A[i],i+1);
        A[i] = left*right;
        return curr*right;
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        elementProduct(array,array.length,1,0);
        System.out.println(Arrays.toString(A));
    }
}
/**
    time complexity = O(n);
    space complexity = O(1);
 */