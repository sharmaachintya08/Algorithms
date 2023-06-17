package LeetCode;
//LEETCODE :- 4. MEDIAN OF 2 SORTED ARRAYS


class MedianOfTwoSortedArr{
    public static void main(String[] args){
        MedianOfTwoSortedArr obj = new MedianOfTwoSortedArr();
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        double ans = obj.findMedianSortedArrays(num1, num2);
        System.out.println(ans);
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return findMedianSortedArraysUtil(nums1,nums2);
    }
    private double findMedianSortedArraysUtil(int[] nums1,int[] nums2){
        int[] numsCombined = combineAndSortArrays(nums1,nums2); 
        double numsCombinedMedian = findNumsMedian(numsCombined);
        return numsCombinedMedian;
    }
    private int[] combineAndSortArrays(int[] nums1,int[] nums2){
        int[] numsCombined = new int[nums1.length + nums2.length];
        int nums1Pointer= 0;
        int nums2Pointer = 0;
        int numsCombinedPointer = 0;
        while(nums1Pointer < nums1.length && nums2Pointer < nums2.length){
            if(nums1[nums1Pointer] <= nums2[nums2Pointer]){
                numsCombined[numsCombinedPointer] = nums1[nums1Pointer];
                nums1Pointer ++;
            }else if(nums1[nums1Pointer] > nums2[nums2Pointer]){
                numsCombined[numsCombinedPointer] = nums2[nums2Pointer];
                nums2Pointer ++;
            }
            numsCombinedPointer ++;
        }
        for( ; nums1Pointer < nums1.length ; nums1Pointer++){
            numsCombined[numsCombinedPointer] = nums1[nums1Pointer];
            numsCombinedPointer ++;
        }
        for( ; nums2Pointer < nums2.length ; nums2Pointer++){
            numsCombined[numsCombinedPointer] = nums2[nums2Pointer];
            numsCombinedPointer ++;
        }
        return numsCombined;
    }
    private double findNumsMedian(int[] nums){
        double numsMedian = 0;
        if(nums.length%2 != 0){
            numsMedian = nums[(nums.length / 2)];
        }else{
            //even
            numsMedian = ( (nums[(nums.length / 2) -1 ]) + nums[(nums.length  / 2)] ) / 2.0 ;
        }
        return numsMedian;
    }
}