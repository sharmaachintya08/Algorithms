/*
 * problem :- Add elements of two arrays into a new array
 * problem set :- Given two arrays of positive integers, add their elements into a new array. The solution should add both arrays, one by one
 *  starting from the 0th index, and split the sum into individual digits if it is a 2–digit number.
 */

import java.util.ArrayList;
import java.util.List;

public class AddTwoArrayElements {
    public static void splitNumber(int sum , List<Integer> result){
        if(sum > 0){
            splitNumber(sum/10,result);
            result.add(sum%10);
        }
    }
    public static void addElements(int[] A ,int[] B ,List<Integer> result){
        int m = A.length ;
        int n = B.length;
        int i = 0;
        while(i<m&&i<n){
            int sum = A[i] + B[i];
            splitNumber(sum,result);
            i++;
        }
        while(i<m){
            splitNumber(A[i],result);
            i++;
        }
        while(i<n){
            splitNumber(B[i],result);
            i++;
        }
    } 
    public static void main(String[] args){
        int[] A = {23,5,2,7,87};
        int[] B = {4,67,2,9};
        List<Integer> result = new ArrayList<>();
        addElements(A,B,result);
        System.out.println(result);
    }
}
/*
 * time complexity :- O(n+m);
 * space complexity :- O(n);
 */