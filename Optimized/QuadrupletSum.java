/*
 * problem :- 4–Sum Problem | Quadruplets with a given sum
 * problem set :- 4-sum problem: Given an unsorted integer array, check if it contains four elements tuple (quadruplets) having a given sum
 */

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Pair{
    public int x,y;
    Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class QuadrupletSum {
    public static boolean hasQuadruplet(int[] nums , int n , int target){
        Map<Integer,List<Pair>> map = new HashMap<>(); 
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int val = target - (nums[i]+nums[j]);
                if(map.containsKey(val)){
                    for(Pair pair:map.get(val)){
                        int x = pair.x;
                        int y = pair.y;
                        if((x!=i&&x!=j)&&(y!=i&&y!=j)){
                            System.out.println("quadrupled found ("+nums[i]+","+nums[j]+","+nums[x]+","+nums[y]+")");
                            return true;
                        }
                    }
                }
                map.putIfAbsent(nums[i]+nums[j], new ArrayList<>());
                map.get(nums[i]+nums[j]).add(new Pair(i,j));
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {2,7,4,0,9,5,1,3};
        int target = 20;

        if(!hasQuadruplet(nums,nums.length,target)){
            System.out.println("Quadruplet doesnt exist");
        }
    }
}
