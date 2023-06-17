//josephus Problem

package Algorithms.Recursion;

public class josephusProblem {
    public static void main(String[] args){
        System.out.println(findJoseph(5, 3));
    }
    static int findJoseph(int n ,int k){
        if(n == 1) return 0;
        return (findJoseph(n-1, k) + k) % n;
    }
}
