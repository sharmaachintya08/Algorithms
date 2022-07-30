/*
 * problem :- Find all symmetric pairs in an array of pairs
 * problem set :- Given an array of pairs of integers, find all symmetric pairs, i.e.,
 *               pairs that mirror each other. For instance, pairs (x, y) and (y, x) are mirrors of each other
 */

import java.util.HashSet;

class Pair{
    public int x,y;
    Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class SymmetricPair {
    public static void symmetricPair(Pair[] pair){
        HashSet<String> set = new HashSet<>();
        for(Pair curr_pair : pair){
            String put_pair = "("+curr_pair.x+","+curr_pair.y+")";
            set.add(put_pair);
            String rev_pair = "("+curr_pair.y+","+curr_pair.x+")";
            if(set.contains(rev_pair)){
                System.out.println(put_pair+"|"+rev_pair);
            }
        }
    }
    public static void main(String[] args){
        Pair[] pair = {
            new Pair(3,4) , new Pair(1,2) , new Pair(5,2) , new Pair(7,10) , new Pair(4,3),
            new Pair(2,5) 
        };
        symmetricPair(pair);
    } 
}
/*
 * time complexity :- O(n);
 * space complexity :- O(1);
 */
