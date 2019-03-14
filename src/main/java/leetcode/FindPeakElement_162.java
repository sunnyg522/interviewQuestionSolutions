package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-03-13
 */
public class FindPeakElement_162 {
    public static int findPeakElement(int[] nums) {
        int max = nums[0];
        int index = 0;
        for(int i=1;i<nums.length-2;i++){
            int curr = nums[i];
            int prev = nums[i-1];
            int next = nums[i+1];
            if(curr > prev && curr>next && curr>max){
                index = 1;
                max = curr;
            }
        }
        if(nums[nums.length-1] > max){
            return nums.length-1;
        }
        return index;
    }

    public static void main(String[] args) {

    }
}
