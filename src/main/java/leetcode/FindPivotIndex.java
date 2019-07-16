package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-07-08
 */
public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum=0;
        for (int num: nums){
            sum+= num;
        }
        for(int i=0;i<nums.length;i++){
            if(leftSum == sum-leftSum-nums[i])
                return i;
            leftSum +=nums[i];
        }
        return -1;

    }
}
