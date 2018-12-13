package leetcode;

/**
 * @project q
 * @authore dgunda on 12/7/18
 */
public class MissingNumber_268 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{1,4,5,3,0}));
    }
    public static int missingNumber(int[] nums) {
        int result = nums.length;
        for(int i=0;i<nums.length;i++){
            result = result ^(i ^nums[i]);
        }
        return result;
    }
}
