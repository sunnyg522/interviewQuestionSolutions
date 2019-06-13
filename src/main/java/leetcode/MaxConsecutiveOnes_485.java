package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-06-11
 */
public class MaxConsecutiveOnes_485 {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max1s = Integer.MIN_VALUE;
        boolean isOne = false;
        int count = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]==1){
                isOne = true;
                count++;
            }
            else  if (nums[i]!=1){
                isOne = false;
                max1s = Math.max(count, max1s);
                count = 0;
            }
        }
        max1s = Math.max(count, max1s);
        return max1s;
    }
}
