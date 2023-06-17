//find the number of ways to travel from point a to b in n * m matrix

package Algorithms.Recursion;

public class NumberOfWaysInMatrix {
    public static void main(String[] args){
        System.out.println(findWays(2,3));
    }
    static int findWays(int n , int m ){
        if(n == 1 || m == 1 ) return 1;
        return findWays(n-1,m) + findWays(n,m-1);
    }
}
