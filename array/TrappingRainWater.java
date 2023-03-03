//Trapping RainWater problem 

package Algorithms.Arrays;

public class TrappingRainWater {
    static int findTrappedWater(int arr[]){
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int largest = 0;
        int totalWater = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            left[i] = largest;
        }
        largest = 0;
        for(int i = arr.length-1 ; i >= 0 ; i--){
            if(arr[i] > largest){
                largest = arr[i];
            }
            right[i] = largest;
        }
        for(int i = 0 ; i < arr.length ; i++){
            totalWater += Math.min(left[i],right[i]) - arr[i];
        }
        return totalWater;
    }
    public static void main(String[] args){
        int a[] = {3,1,2,4,0,1,3,2};
        System.out.println(findTrappedWater(a));
    }
}
