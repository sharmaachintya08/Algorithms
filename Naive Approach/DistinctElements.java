/*
 * problem :- Find the count of distinct elements in every subarray of size `k`
 * problem set:- Given an array and an integer k, find the count of distinct elements in every subarray of size k.
 */

class DistinctElements {
    public static void distinctElements(int[] A, int K) {
        for (int i = 0; i <= A.length - K; i++) {
            int distinct = 0;
            for (int j = i; j < i + K; j++) {
                distinct++;
                for (int x = i; x < j; x++) {
                    if (A[j] == A[x]) {
                        distinct--;
                        break;
                    }
                }
            }
            System.out.printf("the distinct elements in subarray {%d,%d} is %d\n", i, i + K - 1, distinct);
        }
    }

    public static void main(String[] args) {
        int[] A = { 2, 1, 2, 3, 2, 1, 4, 5 };
        int k = 5;
        distinctElements(A, k);
    }
}