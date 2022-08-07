/*
 * problem :- Determine the index of an element that satisfies given constraints in an array
 * problem set :- Given an integer array, determine the index of an element before which all elements are smaller and after which all are greater.
 */
public class ConstraintIndex {
    public static int findIndex(int[] A){
        int n = A.length;
        if(n<=2){
            return -1;
        }
        int[] left = new int[n];
        left[0] = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            left[i] = Math.max(A[i-1],left[i-1]);
            System.out.printf("%d\t",left[i-1]);
        }
        System.out.println();
        int[] right = new int[n];
        right[n-1] = Integer.MAX_VALUE;
        for(int i= n-2;i>=0;i--){
            right[i] = Math.min(A[i+1],right[i+1]);
            System.out.printf("%d\t",right[i+1]);
        }
        System.out.println();
        for(int i=1;i<n;i++){
            if(left[i]<A[i]&&A[i]<right[i]){
                return i;
            }
        }
        return  -1;
    }
    public static void main(String[] args){
        int nums[] = {4,2,3,5,1,6,7,9};
        int res = findIndex(nums);
        if(res==-1){
            System.out.println("invalid result");
        }
        else{
            System.out.println(res);
        }
    }
}
