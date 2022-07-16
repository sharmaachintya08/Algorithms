/**
    problem :- Given an integer array, find the maximum difference between two elements in it such that the 
    smaller element appears before the larger element.
 */
class MaxDiff{
    static void maxDiff(int[] A){
        int diff = 0;
        int tdiff = 0;
        int check_i = 0,check_j = 0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[j]>A[i]){
                    diff = A[j] - A[i];
                    if(diff>tdiff){
                        tdiff = diff ;
                        check_i = i;
                        check_j = j;
                    }
                }
            }
        }
        System.out.println("max diff:- "+ tdiff+" array :- "+A[check_j]+" "+A[check_i]);
    }
    public static void main(String[] args){
        int[] array = {2,7,9,5,1,3,5};
        maxDiff(array);
    }
}
/**
    time complexity :- O(n^2);
    space complexity :- O(1);
 */