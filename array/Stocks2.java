//Best time to buy and sell stocks
//can buy stocks as many times as we want


public class Stocks2 {
    static int findProfit(int arr[]){
        int Profit = 0;
        for(int i = 1; i < arr.length ; i++){
            if(arr[i] > arr[i-1]){
                Profit += (arr[i] - arr[i-1]); 
            }
        }
        return Profit;
    }
    public static void main(String[] args){
        int arr[] = {5,2,6,1,4,7,3,6};
        System.out.println(findProfit(arr));
    }
}
