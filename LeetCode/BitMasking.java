//check if the bit at 6th pos is 0 or 1

package Algorithms.BitManipulation;

public class BitMasking{
    public static void main(String[] args){
        int n = 12;
        System.out.println(n & (1 << 3));
    }
}