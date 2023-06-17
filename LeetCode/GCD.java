package Algorithms.MathematicsAndNumberTheory;

public class GCD {
    public static void main(String[] args){
        System.out.println(returnGCD(1, 2));
    }
    static int returnGCD(int a,int b){
        if(b == 0) return a;
        return returnGCD(b, a%b);
    }
}
