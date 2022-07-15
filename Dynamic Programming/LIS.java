/**
    problem :- longest increasing subarray
 */

class LIS{
    static void longestSubarray(int[] A){
        int[] arr = new int[A.length];
        int omax = 0;
        for(int i=0;i<arr.length;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(A[j]<A[i]){
                    if(arr[j]>max){
                        max = arr[j]; 
                    }
                }
            }
            arr[i] = max+1;
            if(arr[i]>omax){
                omax = arr[i];
            }
        }
        System.out.println(omax);
    }
    public static void main(String[] args){
        int[] array = {1,2,5,2,1,45,123,13,50,98,22};
        longestSubarray(array);
    }
}
/**
    time complexit :- O(n^2);
    space complexity:- O(1);
 */