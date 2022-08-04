
/*
 * problem :- Find the sorted triplet in an array
 * problem set :- Given an integer array A, efficiently find a sorted triplet such that A[i] < A[j] < A[k] and 0 <= i < j < k < n, 
 * where n is the array size.
 */
import java.util.Arrays;

class Tuple<X, Y, Z> {
    public final X first;
    public final Y second;
    public final Z third;

    private Tuple(X first, Y second, Z third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static <X, Y, Z> Tuple<X, Y, Z> of(X a, Y b, Z c) {
        return new Tuple<>(a, b, c);
    }
}

public class SortedTriplet {
    public static Tuple<Integer, Integer, Integer> findTriplet(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return null;
        }
        int[] min = new int[n];
        Arrays.fill(min, -1);
        int min_index_so_far = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[min_index_so_far]) {
                min_index_so_far = i;
            } else if (arr[i] > arr[min_index_so_far]) {
                min[i] = min_index_so_far;
            }
        }
        int[] max = new int[n];
        Arrays.fill(max, -1);
        int max_index_so_far = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > arr[max_index_so_far]) {
                max_index_so_far = i;
            } else if (arr[i] < arr[max_index_so_far]) {
                max[i] = max_index_so_far;
            }
        }
        for (int i = 0; i < n; i++) {
            if (min[i] != -1 && max[i] != -1) {
                return Tuple.of(min[i], i, max[i]);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] input = { 5, 4, 3, 7, 6, 1, 9 };
        Tuple<Integer, Integer, Integer> triplet = findTriplet(input);
        if (triplet != null) {
            System.out.println("Triplet Found : (" + input[triplet.first] + ", " + input[triplet.second] + ", "
                    + input[triplet.third] + ")");
        } else {
            System.out.println("Triplet not found");
        }
    }
}
/*
 * tc :- O(N);
 * sc :- O(1);
 */