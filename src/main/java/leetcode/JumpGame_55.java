package leetcode;

/**
 * @project q
 * @authore dgunda on 12/3/18
 */
public class JumpGame_55 {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,0}));
        System.out.println(canJump(new int[]{3,2,1,0,4}));
    }
    public static boolean canJump(int[] nums) {
        if(nums.length == 1)
            return nums[0] == 0 || nums[0]==1?true:false;
        int lastIndex = nums.length-1;
        int i=0;
        while (i<=lastIndex){
            if(nums[i] == 0 && i!=lastIndex)
                return false;
            else if(i==lastIndex)
                return true;
            i = nums[i]++;
        }
        return i==lastIndex?true:false;
    }
}
