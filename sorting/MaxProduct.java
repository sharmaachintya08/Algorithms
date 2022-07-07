//in this problem we have to find the maximum product of 2 numbers in the array
//i first solved this problem with the bruteforce with time complexity of O(n^2)
//but we can reduce the time complexity of the problem by sorting this array with the suitable sorting algorithm

import java.util.Arrays;
class MaxProduct{
    public static void MaxProduct(int[] array){
        int n = array.length;
        if(n<2){
            return;
        }
        Arrays.sort(array);
        if(array[0]*array[1] > array[n-1]*array[n-2]){
            System.out.println(array[0]+" "+array[1]);
        }
        else{
            System.out.println(array[n-1]+" "+array[n-2]);
        }
    }
    public static void main(String[] args){
        int[] array = {-10,-2,5,6,-20};
        MaxProduct(array);
    }
}