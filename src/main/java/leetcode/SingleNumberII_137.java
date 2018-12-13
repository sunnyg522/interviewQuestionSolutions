package leetcode;

/**
 * @project q
 * @authore dgunda on 12/7/18
 */
public class SingleNumberII_137 {
    public static void main(String[] args) {
        //System.out.println(singleNumber(new int[]{2,2,3,2}));
        System.out.println(3^4);
        System.out.println(7);
        System.out.println(7);

    }
    public static int singleNumber(int[] nums) {
        int result = nums[0];
        for(int i=1;i<nums.length;i++){
            result = result^nums[i];
        }
        return result;
    }
}
