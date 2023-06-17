package LeetCode;
//in this problem we will be using the fisher yates algorithm for shuffling an array in O(n) time complexity

import java.util.Random;
class FisherYates{
    static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static void fisherYates(int[] array){
        Random r = new Random();
        System.out.println(array.length);
        for(int i=array.length-1;i>=0;i--){
            int j = r.nextInt(i+1);
            System.out.println(i+" "+j);
            swap(array,i,j);
        }
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        fisherYates(array);
        System.out.println("randomized array:- ");
        for(int random : array){
            System.out.println(random);
        }
    }
}