/*
 * problem :- find pairs with difference 'k' in an array;
 * problem set :- Given an unsorted integer array , print all pairs with a given difference k in it
 */

import java.util.*;
public class DiffK {
    public static void differencePairs(int[] A,int target){
        Set<Integer>set = new HashSet<>();
        for(int i:A){
            if(set.contains(i-target)){
                System.out.println(i+" "+(i-target));
            }
            if(set.contains(i+target)){
                System.out.println((i+target)+" "+i);
            }
            set.add(i);
        }
    }
    public static void main(String[] args){
        int[] A = {2,3,7,4,3,1};
        int target = 3;
        differencePairs(A,target);
    }
}
