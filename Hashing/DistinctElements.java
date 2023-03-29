//count distinct elements

import java.util.HashSet;

public class DistinctElements {
    static int findDistinct(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        return set.size();
    }
    public static void main(String[] args){
        int arr[] = {5,10,15,5,4};
        System.out.println("distinct elements :- "+findDistinct(arr));
    }
}
