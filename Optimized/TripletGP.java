/*
 * problem :- Print all triplets that form a geometric progression
 * problme set:- Given a sorted array of distinct positive integers, 
 * print all triplets that forms a geometric progression with an integral common ratio.
 */

public class TripletGP {
    public static void tripletCheck(int[] A) {
        if (A.length < 3) {
            return;
        }
        for (int j = 1; j < A.length - 1; j++) {
            int i = j - 1;
            int k = j + 1;
            while (true) {
                while (i >= 0 && k < A.length && (A[j] % A[i] == 0) && (A[k] % A[j] == 0)
                        && (A[j] / A[i] == A[k] / A[j])) {
                    System.out.println("(" + A[i] + "," + A[j] + "," + A[k] + ")");
                    i--;
                    k++;
                }
                if (i < 0 || k >= A.length) {
                    break;
                }
                if (A[j] % A[i] == 0 && A[k] % A[j] == 0) {
                    if (A[j] / A[i] < A[k] / A[j]) {
                        i--;
                    } else {
                        k++;
                    }
                } else if (A[j] % A[i] == 0) {
                    k++;
                } else {
                    i--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 6, 10, 18, 54 };
        tripletCheck(A);
    }
}
