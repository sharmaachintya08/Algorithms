/*
 * problem :- 4–Sum Problem | Quadruplets with a given sum
 * problem set:- 4-sum problem: Given an unsorted integer array, check if it contains four elements tuple (quadruplets) having a given sum.
 */

public class QuadrupletSum {
    public static boolean hasQuadruplet(int[] nums,int n,int target,int count){
        if (target == 0 && count == 4) {
            return true;
        }
        if (count > 4 || n == 0) {
            return false;
        }
        return hasQuadruplet(nums, n - 1, target - nums[n - 1], count + 1) ||
                        hasQuadruplet(nums, n - 1, target, count);
    }
    public static void main(String[] args){
        int[] nums = {2,7,4,0,9,1,3};
        int target = 20;
        if(hasQuadruplet(nums,nums.length,target,0)){
            System.out.println("quadruplet exists");
        }
        else{
            System.out.println("Quadruplet does not exist");
        }
    }
}
