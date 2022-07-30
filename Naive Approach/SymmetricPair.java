/*
 * problem :- Find all symmetric pairs in an array of pairs
 * problem set:- Given an array of pairs of integers, find all symmetric pairs, i.e., pairs that mirror each other. 
 *               For instance, pairs (x, y) and (y, x) are mirrors of each other.
 */

class Pair {
    public int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class SymmetricPair {
    public static void symmetricPair(Pair[] pair) {
        Pair x = new Pair(-1, -1);
        for (Pair outer : pair) {
            if (x.x == -1 && x.y == -1) {
                x.x = outer.x;
                x.y = outer.y;
            } else {
                x.x = outer.x;
                x.y = outer.y;
            }
            for (Pair curr_pair : pair) {
                if (x.x == curr_pair.y && x.y == curr_pair.x) {
                    System.out.println("(" + x.x + "," + x.y + ")" + " " + "(" + curr_pair.x + "," + curr_pair.y + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        Pair[] pair = {
                new Pair(3, 4), new Pair(1, 2), new Pair(5, 2), new Pair(7, 10),
                new Pair(4, 3), new Pair(2, 5)
        };
        symmetricPair(pair);
    }
}
/*
 * since this is a naive approach im not able to delete the duplicates
 * time complexity :- O(n^2);
 * space complexity :- O(1);
 */
