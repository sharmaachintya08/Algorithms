package LeetCode;
//Best time to buy and sell stocks to Maximize Profit
//stocks can be bought only once


public class Stocks {
    static int findProfit(int arr[]){
        int minSoFar = 9999;
        int maxProfit = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < minSoFar){
                minSoFar = arr[i];
            }
            if(maxProfit < (arr[i] - minSoFar)){
                maxProfit = arr[i] - minSoFar;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int arr[] = {3,1,4,8,7,2,5};
        System.out.println(findProfit(arr));
    }
}
