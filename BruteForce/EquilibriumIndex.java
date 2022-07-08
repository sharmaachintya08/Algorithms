/**
    In this problem we have to find wether the given index is equilbrium or not 
    the index is at equilibrium if the sum of array from 0 to that index is equal to the sum of the array from that index +1 to n-1
    ex A[0]......+A[i-1] = A[i+1].....+A[n-1]
 */

 class EquilibriumIndex{
    static void equilibriumIndex(int[] array){
        int[] left = new int[array.length];
        left[0] = array[0];
        int right = 0;
        for(int i=1;i<array.length;i++){
            left[i] = left[i-1] + array[i];
        }
        for(int j = array.length -1 ;j>=0;j--){
            right += array[j];
            if(left[j] == right){
                System.out.println(j);
            }
        }
    }
    public static void main(String[] args){
        int[] array = {0, -3, 5, -4, -2, 3, 1, 0};
        equilibriumIndex(array);
    }
 }

/**
    Time complexity :- O(n) since there are 2 for loops working here with n numbers so n+n = 2n and if statement would be running for n times inside the loop
    space complexity :- O(1) since the array is of fixed size and the number of inputs will be fixed
 */