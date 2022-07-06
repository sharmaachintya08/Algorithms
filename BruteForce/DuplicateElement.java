//in this problem we have to find the duplicate element in the array 
//i'm using brute force method in this program 
//it's time complexity will be O(n^2)

import java.util.Scanner;

class DuplicateElement{
    
    public static void DuplicateElement(int[] array,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               if(array[i]==array[j]){
                    System.out.println("duplicate element :-"+array[i]);
               } 
            }
        }
    }
    public static void main(String[] args){
        System.out.println("limit for the array:- ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
        } 
        DuplicateElement(array,n);
    }
}