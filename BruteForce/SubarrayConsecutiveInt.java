/**
    in this problem we are given an array and we have to find out the largest subarray of concequetive numbers
    i am using bruteforce to solve this problem
 */

import java.lang.Math;
class SubarrayConcequetiveInt{
    static boolean isConcequetive(int[] array,int i,int j,int min_val,int max_val){
        if(max_val - min_val != j-i){
            return false;
        }
        boolean visited[] = new boolean[j-i+1];
        for(int k=i;k<=j;k++){
            if(visited[array[k]-min_val]){
                return false;
            }
            visited[array[k]-min_val] = true;
        }
        return true;
    }
    static void findMaxSubarray(int[] array){
        int len = 1;
        int start = 0,end = 0;
        for(int i=0;i<array.length;i++){
            int min_val = array[i];
            int max_val = array[i];
            for(int j=i+1;j<array.length;j++){
                min_val = Math.min(min_val,array[j]);
                max_val = Math.max(max_val,array[j]); 
                if (isConcequetive(array,i,j,min_val,max_val)){
                   if(len<max_val -min_val +1){
                        len = max_val - min_val + 1;
                        start = i;
                        end  = j;
                   } 
                }
            }
        }
        System.out.println("The largest subarray is [ " + start + ", " + end + "]");
    }
    public static void main(String[] args){
        int[] A = {2,0,2,1,4,3,1,0};
        findMaxSubarray(A);
    }
}