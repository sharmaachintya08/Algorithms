/**
 * Problem :- Find the longest continuous sequence length with the same sum in given binary arrays 
 * Problem set:- Given two binary arrays, X and Y, find the length of the longest continuous sequence that starts and ends at the same index in both arrays and have the same sum. 
 * In other words, find max(j-i+1) for every j >= i, where the sum of subarray X[i, j] is equal to the sum of subarray Y[i, j].
 */

public class ContinousSubSequence {
    public static int longestSequence(int[] X,int[] Y){
        int LLength = 0;
        int sumX = 0 , sumY = 0;
        for(int i=0;i<X.length;i++){
            for(int j=i;j<X.length;j++){
                sumX = X[j];
                sumY = Y[j];
                if(sumX==sumY){
                    int Length = j-i+1;
                    if(Length > LLength){
                        LLength = Length;
                    }
                }
            }
        }
        return LLength ;
    }
    public static void main(String[] args){
        int[] X = {0,0,1,1,1,1};
        int[] Y = {0,1,1,0,1,0};
        System.out.println(longestSequence(X,Y));
    }
}
/**
 * time complexity :- O(n^2);
 * space complexity :- O(1);
 */
