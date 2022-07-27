/* problem set:- Given an unsorted integer array, print all distinct four elements tuple (quadruplets) in it, having a given sum.*/

import java.util.Arrays;

public class QuadrupletPrint {
    public static void quadTuple(int[] A,int target){
        Arrays.sort(A);
        for(int i=0;i<=A.length-4;i++){
            for(int j=i+1;j<=A.length-3;j++){
                int k = target - (A[i]+A[j]);
                int low = j+1; int high = A.length - 1;
                while(low<high){
                    if(A[low]+A[high]<k){
                        low++;
                    }
                    else if(A[low]+A[high]>k){
                        high--;
                    }
                    else{
                        System.out.println("("+A[i]+","+A[j]+","+A[low]+","+A[high]+")");
                        low++;
                        high--;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        int[] A = {2,7,4,0,9,5,1,3};
        int target = 20;
        quadTuple(A,target);
    }
}
