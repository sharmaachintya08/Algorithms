/**
 * problem :- Find maximum profit earned by buying and selling shares any number of time
 * problem set :-  Given a list containing future prediction of share prices, find the maximum profit earned by buying and selling shares any number of times with the constraint, 
 *                 a new transaction can only start after the previous transaction is complete, i.e., we can only hold at most one share at a time.
 */


public class MaxShares {
    public static int maxProfit(int[] A){
        int TProfit = 0;
        for(int i=1;i<A.length;i++){
            if(A[i]>A[i-1]){
                TProfit += A[i] - A[i-1];
            }
        }
        return TProfit ;
    }
    public static void main(String[] args){
        int[] A = {5,2,6,1,4,7,3,6};
        System.out.println(maxProfit(A));
    }    
}
