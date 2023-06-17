//Print the powerset of a given String

package Algorithms.Recursion;

public class PowerSet {
    public static void main(String[] args){
        String s = "abc";
        String curr = "";
        findPowerSet(s, 0, curr);
    }
    static void findPowerSet(String s , int i , String cur){
        if( i == s.length()){
            System.out.println(cur);
            return;
        }
        findPowerSet(s, i + 1, cur + s.charAt(i));
        findPowerSet(s, i + 1, cur);
    }
}
