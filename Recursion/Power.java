//calculate a raise b by recursion

package Algorithms.Recursion;

public class Power {
    public static void main(String[] args){
        System.out.println(findPower(2,3));
    }
    static int findPower(int a,int b){
        if(b == 0) return 1;
        return a * findPower(a,b-1);
    }
}
