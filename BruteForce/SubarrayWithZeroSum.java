package algorithms.BruteForce;
//in this algorithm we have to find if the sum 0 exists in the given subarray
//we will use the bruteforce for this
//time complexity of o(n^2)

class SubarrayWithZeroSum{
    public static void hasZero(int[] nums){
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                if(sum==0){
                    System.out.println("Subarray ["+i+"..."+j+"]");
                } 
            }
        }
    }
    public static void main(String[] args){
        int[] nums = {4,-6,3,-1,4,2,7};
        hasZero(nums);
    }
}