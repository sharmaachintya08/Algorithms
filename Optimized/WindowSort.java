/**
 * problem :- Smallest window in the array which can sort all of the array , using window technique; 
 */

class WindowSort{
    public static void windowSort(int[] A){
        int leftIndex = -1 , rightIndex = -1;
        int max_so_far = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(max_so_far < A[i]){
                max_so_far = A[i];
            }
            if(A[i]<max_so_far){
                rightIndex = i;
            }
        }
        int min_so_far = Integer.MAX_VALUE;
        for(int i = A.length - 1;i>=0;i--){
            if(min_so_far > A[i]){
                min_so_far = A[i];
            }
            if(A[i]>min_so_far){
                leftIndex = i;
            }
        }
        if(leftIndex == -1){
            System.out.println("Array already sorted ");
            return ;
        }
        System.out.println("the unsorted shortest array is from " + leftIndex + " to " + rightIndex);
    }
    public static void main(String[] args){
        int[] A = {1,2,3,6,0,5,8,7,9};
        windowSort(A);
    }
}
/**
 * time complexity :- n+n+2 = O(n);
 * space complexity :- O(1);
 */