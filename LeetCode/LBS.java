package LeetCode;
/**
    problem:- longest bitonic subsequence
 */

class LBS{
    static void longestSubarray(int[] A){
        int[] lis = new int[A.length];
        for(int i=0;i<A.length;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(A[j]<=A[i]){
                   if(lis[j] > max){
                    max = lis[j];
                   } 
                }
            }
            lis[i] = max + 1;
        }
        
        int[] lds = new int[A.length];
        for(int i=A.length-1;i>=0;i--){
            int max = 0;
            for(int j=A.length-1;j>i;j--){
                if(A[j]<=A[i]){ //because only the small one can be added in length
                    if(lds[j]>max){
                        max = lds[j];
                    }
                }
            }
            lds[i] = max + 1;
        }
        int omax = 0;
        for(int i=0;i<A.length;i++){
            if(lds[i]+lis[i]-1 > omax){
                omax = lds[i] + lis[i] - 1;
            }
        }

        System.out.println(omax);
    }
    public static void main(String[] args){
        int[] array = {3, 5, 8, 4, 5, 9, 10, 8, 5, 3, 4};
        longestSubarray(array);
    }
}