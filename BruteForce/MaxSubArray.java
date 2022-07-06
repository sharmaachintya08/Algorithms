//in this problem we have to find the subarray by which adding the number we can make the given sum
// for this i am using the bruteforce method 
//time complexity of my program is O(n^3)

import java.util.Scanner;

class MaxSubArray{
    public static void SubArray(int[] array,int n,int check){
        int sum = 0;
        System.out.println("the subarrays:- ");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum += array[j];
                if(sum==check){
                    for(int x=i;x<=j;x++){
                        System.out.print(array[x]);
                    }
                    System.out.println();
                }
            }
            sum = 0;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("sum:- ");
        int check = scan.nextInt();
        System.out.println("limit of the array :- ");
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.println("array:- ");
        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
        }        
        SubArray(array,n,check);
    }
}