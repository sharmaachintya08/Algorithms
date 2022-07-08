/**
    in this problem we have to find the equilibrium index from where the sum of array to the left till 0 and to the right till n-1
    are equal , i solved this problem earlier with the bruteforce method ,now i can solve this in another way
 */

import java.util.stream.IntStream;

class EquilibriumIndex{
    static void equilibriumIndex(int[] array){
        int total = IntStream.of(array).sum();
        int right = 0;
        for(int i = array.length -1 ;i>=0;i--){
            if(right == total - (array[i]+right)){
                System.out.println(i);
            }
            right += array[i];
        } 
    } 
    public static void main(String[] args){
        int[] array = {0, -3, 5, -4, -2, 3, 1, 0};
        equilibriumIndex(array);
    }
}