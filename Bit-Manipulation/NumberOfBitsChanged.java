//find the number of bits changed to convert a to b;

package Algorithms.BitManipulation;

public class NumberOfBitsChanged {
    public static void main(String[] args){
        int a = 12;
        int b = 11;
        int c = a ^ b;
        int n = 0;
        while(true){
            if(c == 0){
                break;
            }else{
                c = c >> 1;
                n++;
            }
        }
        System.out.println(n);
    }
}
