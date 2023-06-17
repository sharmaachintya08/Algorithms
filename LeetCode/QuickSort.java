//this is a quick sort solved using devide and conquer
//in this we swap when the i element is smaller than the j element with the j element and increment i
//the best case for the quick sort would be when pivot devided the array in equal parts
//time complexity :- O(nlogn) BEST CASE
//time complextiy:- O(N^2) worst case

import java.util.Scanner;
class QuickSort{
    public static void DevideandConquer(int[] array,int low , int high){
        //by writting array like this we are sending the reference of the array
        if(low<high){
            int pivot = QuickSort(array,low,high);
            DevideandConquer(array,low,pivot-1);
            DevideandConquer(array,pivot+1,high);
        }
    }
    public static void Swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static int QuickSort(int[] array,int low,int high){
        int pivot = low;
        int i = low ;
        int j = high ;
        while(i<j){//until this condition states false this loop will run infinitely
            while(array[i]<=array[pivot]){
                i++;
            }
            while(array[j]>array[pivot]){
                j--;
            }
            if(i<j){
                Swap(array,i,j);
            }
        }
        Swap(array,low,j);
        return j; //returning the jth position because the pivot element is at jth position now*/
    }
    public static void main(String[] args){
        int n;
        int low,high;
        Scanner scan = new Scanner(System.in);
        System.out.println("type the limit for the array");
        n = scan.nextInt();

        int[] array = new int[n];
        System.out.println("type the array");
        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
        }
        low = 0;
        high = n-1;
        DevideandConquer(array,low,high);
        System.out.println("Sorted Array :- ");
        for(int finalArray: array){
            System.out.println(finalArray);
        }
    }
}
