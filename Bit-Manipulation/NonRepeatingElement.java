//find the only non repeating element in an array where every element repeats true

package Algorithms.BitManipulation;

public class NonRepeatingElement {
    public static void main(String[] args){
        int arr[] = {5,4,1,4,3,5,1};
        int res = 0;
        for(int i = 0;i<arr.length;i++){
            res = arr[i] ^ res;
        }
        System.out.println(res);
    }
}
