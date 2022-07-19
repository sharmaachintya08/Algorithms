/**
    problem :- Given an integer array, find and print a contiguous subarray with the maximum sum in it.
    can be solved by kadens method
 */

class ContSubArray{
    static void contSubArray(int[] A){
        int maxSum = 0;
        int currSum = 0;
        int beg = 0;
        int end = 0;
        for(int i=0;i<A.length;i++){
            currSum =currSum + A[i];
            if(currSum > maxSum){
                if(beg == 0){
                    beg = i;
                }
                maxSum = currSum ;
            }
            else{
                if(end == 0){
                    end = i;
                }
            }
            if(currSum < 0){
                beg = 0;
                end = 0;
                currSum = 0;
            }
        }
        for(int j = beg;j<end;j++){
            System.out.println(A[j]);
        }
    }
    public static void main(String[] args){
        int[] A = {-2,1,5,4,3,-2};
        contSubArray(A);
    }
}
/**
    time complexity :- O(n);
    space complexity :- O(1);
 */