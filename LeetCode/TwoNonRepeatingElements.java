//find the two non repeating element in an array where every element repeats true

package Algorithms.BitManipulation;

import java.util.ArrayList;

public class TwoNonRepeatingElements {
    public static void main(String[] args){
        int arr[] = {5,4,1,4,3,5,1,2};
        int res = 0;
        for(int i = 0;i < arr.length;i++){
            res = res ^ arr[i];
        }
        int temp = res;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if((arr[i] % 2) == 0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        for(int i =0;i<even.size();i++){
            res = res ^ even.get(i);
        }
        for(int j = 0;j<odd.size();j++){
            temp = temp ^ odd.get(j);
        }
        System.out.println("res :- " + res + " temp :- " + temp);
    }
}
