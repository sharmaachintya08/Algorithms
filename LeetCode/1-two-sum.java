import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] A, int target) {
        int[] sol = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(target - A[i])){
                sol[1] = map.get(target - A[i]);
                sol[0] = i;
            }
            map.put(A[i],i);
        }
        return sol;
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.twoSum(nums,target)));
    }
}