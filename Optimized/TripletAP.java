/*
 * problem :- Print all triplets that form an arithmetic progression
 * problem set:- Given a sorted array of distinct positive integers, 
 * print all triplets that forms an arithmetic progression with an integral common difference.
 */

public class TripletAP {
    public static void tripletCheck(int[] A){
        if (A.length < 3) {
            return;
        }
        for (int j = 1; j < A.length - 1; j++)
        {
            int i = j - 1, k = j + 1;
            while (i >= 0 && k < A.length)
            {
                if (A[i] + A[k] == 2 * A[j])
                {
                    System.out.println(A[i] + " " + A[j] + " " + A[k]);
                    k++; i--;
                }
                else if (A[i] + A[k] < 2 * A[j]) {
                    k++;
                }
                else {
                    i--;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] A = {1,3,5,6,8,9,15};
        tripletCheck(A);
    }
}
/*
 * time complexity :- O(n^2);
 * space complexity:-O(1);
 */