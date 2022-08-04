/*
 * problem :- Efficiently calculate the frequency of all elements present in a limited range array
 * problem set :- Given an unsorted integer array whose elements lie in the range 0 to n-1 where n is the array size,
 *  calculate the frequency of all array elements in linear time and using constant space.
 */

class FrequencyOfElements {
    public static void checkFrequency(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            A[A[i] % n] += n;
        }
        for (int i = 0; i < n; i++) {
            if (A[i] / n != 0) {
                System.out.println(i + " appears " + A[i] / n + " times ");
            }
        }
        for (int i = 0; i < n; i++) {
            A[i] = A[i] % n;
        }
    }

    public static void main(String[] args) {
        int[] A = { 2, 3, 3, 2, 1 };
        checkFrequency(A);
    }
}