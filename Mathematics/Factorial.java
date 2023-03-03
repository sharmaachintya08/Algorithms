//Find the factorial of the number

package Algorithms.MathematicsAndNumberTheory;

public class Factorial {
    public static void main(String[] args){
        int fact = 5;
        int res = 1;
        while(true){
            if(fact == 0){
                break;
            }
            res = res * fact;
            fact--;
        }
        System.out.println(res);
    }
}
