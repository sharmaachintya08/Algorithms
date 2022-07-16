/**
    problem:-Given an integer array, find the maximum difference between two elements in it such that the smaller element appears before the larger element.
    solved this problem in a bruteforce method , now we can optimize this to run in linear time complexity

    logic :- behind this code is if we subtract the largest number with the smallest one
    we will get the maximum difference , thats what im doing here
    at the else statement at the diff we are finding the max diff from the largest number and the smallest one ,since the computer doesnt know about the smallest number we are finding the max of difference and the sub of 2 numbers
 */

class MaxDiff{
    static void maxDiff(int[] A){
        int diff = 0;
        int max = A[A.length-1];
        for(int i = A.length - 2;i>=0;i--){
            if(A[i] >= max){
                max = A[i];
            }
            else{
                diff = Integer.max(diff,max - A[i]);
            }
        }
        System.out.println(diff);
    }
    public static void main(String[] args){
        int[] array = {2,7,9,5,1,3,5};
        maxDiff(array);
    }
}
/**
    time complexity :- O(n);
    space complexity :- O(1);
 */