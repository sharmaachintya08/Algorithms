//Moore Voting algorithm

package Algorithms.Arrays;

public class MooreVoting {
    static void findMoore(int arr[]){
        int ans = 1;
        int sol = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] == arr[i-1]){
                ans ++;
                if(ans != 0){
                    sol = arr[i];
                }
            }else{
                ans --;
            }
        }
        System.out.println(sol);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        findMoore(arr);
    }
}
