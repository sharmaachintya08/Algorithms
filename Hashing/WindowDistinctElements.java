//count the distinct elements in every window of size k

package Algorithms.Hashing;

import java.util.HashMap;


public class WindowDistinctElements {
    static void findDistinctElements(int arr[],int windowSize){
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i = 0 ; i < windowSize ; i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("map distinct element size:- "+map.size());
        for(int i = windowSize ; i < arr.length ; i++){
            if(map.get(arr[i - windowSize]) == 1){
                map.remove(arr[i]);
            }else{
                map.put(arr[i-windowSize],map.get(arr[i-windowSize]) - 1);
            }
            map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
            System.out.println("map distinct element size:- "+map.size());
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,2,1,3,1,1,3};
        int windowSize = 4;
        findDistinctElements(arr,windowSize);
    }
}
