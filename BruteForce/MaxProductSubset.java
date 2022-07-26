/*
 * problem :- Maximum Product Subset Problem
 * problem set:- Given an integer array, find the maximum product of its elements among all its subsets.
 */

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MaxProductSubset {
    public static int findMaxProduct(List<Integer> set,int maximum){
        int product = 1;
        for(int j:set){
            product = product *j;
        }
        if(set.size()!=0){
            maximum = Integer.max(maximum,product);
        }
        return maximum;
    }
    public static int findPowerSet(List<Integer> S,List<Integer> set,int n,int maximum){
        if(n==0){
            return findMaxProduct(set,maximum);
        }
        set.add(S.get(n-1));
        maximum = findPowerSet(S,set,n-1,maximum);
        set.remove(set.size()-1);
        return findPowerSet(S,set,n-1,maximum);
    }
    public static void main(String[] args){
        List<Integer> S = Arrays.asList(-6,4,-5,8,-10,0,8);
        int n = S.size();

        List<Integer>set = new ArrayList<>();
        int maximum = findPowerSet(S,set,n,Integer.MIN_VALUE);
        System.out.println(maximum);
    }    
}
