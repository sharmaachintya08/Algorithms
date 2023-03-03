//Palindrome Numbers

package Algorithms.MathematicsAndNumberTheory;

public class Palindrome {
    public static void main(String[] args){
        int num = 454;
        int temp = num;
        int r,sum = 0;
        while(num > 0){
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if(temp == sum){
            System.out.print("palindrome number");
        }else{
            System.out.print("not palindrome");
        }
    }
}
