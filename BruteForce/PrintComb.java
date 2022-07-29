/*
 * problem :- Print all combinations of numbers from 1 to `n` having sum `n`
 * problem set:- Given a positive integer n, print all combinations of numbers between 1 and n having sum n.
 */

import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintComb {
    public static void printCombinations(int i,int n,int[] out,int index){
        if(n==0){
            System.out.println(Arrays.stream(out).limit(index).boxed().collect(Collectors.toList()));
        }
        for(int j=i;j<=n;j++){
            out[index] = j;
            printCombinations(j,n-j,out,index+1);
        }
    }
    public static void main(String[] args){
        int n = 5;
        int[] out = new int[n];
        printCombinations(1,n,out,0);
    }
}
/*
 * time complexity :- O(2^n)
 * space complexity :- O(1)
 */
