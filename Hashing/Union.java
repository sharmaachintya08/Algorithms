//Union of 2 arrays

package Algorithms.Hashing;

import java.util.HashSet;
import java.util.Set;

public class Union {
    static int findUnion(int arrA[] , int arrB[]){
        Set<Integer> set = new HashSet<>();
        for(int i : arrA){
            set.add(i);
        }
        for(int i : arrB){
            set.add(i);
        }
        return set.size();
    }
    public static void main(String[] args){
        int arrA[] = {1,3,5};
        int arrB[] = {2,0};
        System.out.println("total size of union of 2 arrays:- "+findUnion(arrA,arrB));
    }
}
