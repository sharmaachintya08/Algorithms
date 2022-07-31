/*
 * problem :- Check if an array is formed by consecutive integers
 * problem set :- Given an integer array, check if only consecutive integers form the array.
 */

import java.util.Set;
import java.util.HashSet;

public class ConcequetiveInt {
    public static boolean isConcequetive(int[] A){
        if(A.length <= 1){
            return true;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : A){
            if(i<min){min=i;}
            if(i>max){max=i;}
        }
        if(max-min!=A.length-1){
            return false;
        }
        Set<Integer>visited = new HashSet<>();
        for(int i:A){
            if(visited.contains(i)){
                return false;
            }
            else{
                visited.add(i);
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] A = {-1,5,4,2,0,3,1};
        if(isConcequetive(A)){
            System.out.println("the array is concequetive");
        }
        else{
            System.out.println("the array is not concequetive");
        }
    }    
}
/*
 * time complexity :- O(n);
 */