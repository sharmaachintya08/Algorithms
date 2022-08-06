/*
 * problem :- Find the missing number in an array without using any extra space
 * problem set :- Given a limited range array of size n and containing elements between 1 and n+1 with one element missing, 
 * find the missing number without using any extra space.
 */

import java.util.Arrays;

public class MissingNumber {
    public static int findMissingElement(int[] A){
        int n = A.length;
        int sum = Arrays.stream(A).sum();
        return (n+1)+n*(n+1)/2 - sum;
    }
    public static void main(String[] args){
        int[] A = {3,2,4,6,1};
        System.out.println("the missing element is :- "+findMissingElement(A));
    }    
}
/*
 * tc :- O(1);
 * sc :- O(1);
 */