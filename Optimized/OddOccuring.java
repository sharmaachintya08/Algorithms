/*
 * problem :- Find the odd occurring element in an array in a single traversal
 * problem set :- Given an integer array, duplicates are present in it in a way that all duplicates appear an even number of times except one which appears an odd number of times. 
 * Find that odd appearing element in linear time and without using any extra memory.
 */

public class OddOccuring {
    public static int findElement(int[] A) {
        int xor = 0;
        for (int i : A) {
            xor ^= i;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] A = { 4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3 };
        System.out.println(findElement(A));
    }
}
