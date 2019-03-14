package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-03-12
 */
public class IncreasingTripletSubsequence_334 {
    public static void main(String[] args) {

    }
    public static boolean increasingTriplet(int[] nums) {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int z = nums[i];
            if(x>=z)
                x=z;
            else if(y>=z)
                y=z;
            else
                return true;
        }
        return false;
    }
}
