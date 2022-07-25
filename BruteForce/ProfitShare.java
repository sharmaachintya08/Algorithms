/**
 * Problem :-  Find maximum profit earned by buying and selling shares any number of times 
 * Problem  Set :-    Given a list containing future prediction of share prices, find the maximum profit earned by buying and selling shares any number of times with the constraint
 *                      , a new transaction can only start after the previous transaction is complete, i.e., we can only hold at most one share at a time.
 */

 public class ProfitShare{
    static void maxProfit(int[] A){
        int len = 0;
        int beg = 0;
        int end = 0;
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                int temp = A[j]-A[i];
                if(temp > len){
                    len = temp;
                    beg = i;
                    end = j;
                }
            }
        }
        System.out.println("the maximum profit occurs from day "+ beg+" to "+end);
    }
    public static void main(String[] args){
        int[] A = {1,5,2,3,7,6,4,5};
        maxProfit(A);
    }
 }