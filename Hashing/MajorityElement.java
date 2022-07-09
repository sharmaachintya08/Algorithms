/**
    in this problem we have to find the majority element in an array
    a majority element is that element which occurs more than n/2 times in array of size n
    using hashing for calculating it
 */

import java.util.Map;
import java.util.HashMap;

class MajorityElement{
    static void majorityElement(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:array){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){//since map.entrySet returns a object we cant recieve it with just some common variable
            if(entry.getValue()>array.length/2){
                System.out.println(entry.getKey());
            }
        }
    }
    public static void main(String[] args){
        int array[] = {2,2,1,3,5,3,2,2,5,2,2,10,2,2};
        majorityElement(array);
    }
}
/**
    Time complexity :- O(n) or (O(n+n) = O(2n))
    Space complexity :- O(1)
 */