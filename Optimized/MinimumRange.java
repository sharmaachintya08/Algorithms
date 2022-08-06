/*
 * Problem :- Find a minimum range with at least one element from each of the given arrays
 * Problem set :- Given three sorted arrays of variable length, 
 *  efficiently compute the minimum range with at least one element from each array.
 */

class Pair<U, V> {// a generic class
    public final U first;
    public final V second;

    private Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <U, V> Pair<U, V> of(U a, V b) {// a generic method
        return new Pair<>(a, b);
    }

    @Override
    public String toString() {
        return "[" + first + "," + second + "]";
    }
}

public class MinimumRange {
    public static Pair<Integer, Integer> findMinRange(int[] a, int[] b, int[] c) {
        Pair<Integer, Integer> pair = null;
        int diff = Integer.MAX_VALUE;
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length && k < c.length) {
            int low = Math.min(Math.min(a[i], b[j]), c[k]);
            int high = Math.max(Math.max(a[i], b[j]), c[k]);
            if (diff > high - low) {
                pair = Pair.of(low, high);
                diff = high - low;
            }
            if (a[i] == low) {
                i++;
            } else if (b[j] == low) {
                j++;
            } else {
                k++;
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 8, 10, 15 };
        int[] b = { 1, 5, 12 };
        int[] c = { 7, 8, 15, 16 };

        Pair<Integer, Integer> pair = findMinRange(a, b, c);
        System.out.println("the min range pair :- " + pair);
    }
}
