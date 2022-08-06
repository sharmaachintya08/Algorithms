/*
 * problem :- Longest Consecutive Subsequence
 * problem set :- Given an integer array, find the length of the longest 
 * subsequence formed by the consecutive integers. The subsequence should contain all distinct values, 
 * and the character set should be consecutive, irrespective of its order.
 */

import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class LonConcequetiveSubsequence {
    public static int findSubsequence(int[] A){
        Set<Integer> set = IntStream.of(A).boxed().collect(Collectors.toSet());
        int maxLen = 0;
        for(int e:A){
            if(!set.contains(e-1)){
                int len = 1;
                while(set.contains(e+len)){
                    len ++;
                }
                maxLen = Math.max(len,maxLen);
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        int[] A = {2,0,6,1,5,3,7};
        System.out.println(findSubsequence(A));
    }
}
/*
 * time complexity :- O(n);
 * space compelxity :- O(n);
 */
