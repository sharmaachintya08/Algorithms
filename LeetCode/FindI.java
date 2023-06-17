//finding 5th bit

package Algorithms.BitManipulation;

public class FindI {
    public static void main(String[] args){
        int n = 12;
        int k = 2;
        System.out.println((n & (1 << (k-1))) >> (k-1));
    }
}
