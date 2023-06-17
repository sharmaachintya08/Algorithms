package LeetCode;
//Intersection of 2 arrays

import java.util.HashSet;

public class Intersection {
    static int findIntersection(int a[] , int b[]){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i : a){
            set.add(i);
        }
        for(int i : b){
            if(set.contains(i)){
                count++;
                set.remove(i);
            }
        }
        return count;
    }
    public static void main(String[] args){
        int a[] = {4,2,1,0};
        int b[] = {5,4,1,6};
        System.out.println("intersected elements :- "+findIntersection(a,b));
    }
}
