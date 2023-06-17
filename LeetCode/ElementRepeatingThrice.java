//find the only non repeating element where all the other elements are repeating thrice;

package Algorithms.BitManipulation;

public class ElementRepeatingThrice {
    public static void main(String[] args){
        int arr[] = {2,2,1,5,1,1,2};
        int res = 0;
        for(int i = 0;i < arr.length;i++){
            res = res ^ arr[i];
        }
        
    }
}
