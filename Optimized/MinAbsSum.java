/*
 * problem :- Find a pair with a minimum absolute sum in an array
 * problem set :- Given a sorted integer array, find a pair in it having an absolute minimum sum.
 */

class MinAbsSum {
    public static void minAbsSum(int[] A) {
        int low = 0, high = A.length - 1;
        int i = 0, j = 0;
        int min = Integer.MAX_VALUE;
        while (low < high) {
            if (Math.abs(A[high] + A[low]) < min) {
                min = Math.abs(A[high] + A[low]);
                i = low;
                j = high;
            }
            if (min == 0) {
                break;
            }
            if (A[high] + A[low] > 0) {
                high--;
            } else {
                low++;
            }
        }
        System.out.println("the min abs sum is bw :- " + A[i] + "," + A[j]);
    }

    public static void main(String[] args) {
        int[] A = { -6, -5, -3, 0, 2, 4, 9 };
        minAbsSum(A);
    }
}
/*
 * time complexity :- O(n);
 * space complexity :- O(1);
 */