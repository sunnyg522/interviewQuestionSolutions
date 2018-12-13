package leetcode;

/**
 * @project q
 * @authore dgunda on 12/2/18
 */
public class MaximumSubarray_53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        if(nums.length == 0)
            return 0;
        else if(nums.length == 1)
            return nums[0];
        int maxValue = Integer.MIN_VALUE;
        int currentMax = 0;
        for(int i=0;i<nums.length;i++){
            currentMax = Math.max(currentMax+nums[i],nums[i]);
            maxValue = Math.max(maxValue, currentMax);
        }
        return maxValue;
    }
}
