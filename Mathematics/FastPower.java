package Algorithms.MathematicsAndNumberTheory;

public class FastPower {
    public static void main(String[] args){
        System.out.println(calFastPower(2978432, 5, 100005));
    }
    static long calFastPower(long a ,long b ,long n){
        long res = 1;
        while( b > 0 ){
            if((b&1) != 0){
                res = (res * a % n) % n;
            }
            a = (a%n * a%n) % n;
            b = b >> 1;
        }
        return res ;
    }
}
