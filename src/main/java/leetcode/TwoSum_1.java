package leetcode;

import java.util.HashMap;

/**
 *
 * @project q
 * @authore dgunda on 11/4/18
 */
public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target  = 19;
        System.out.println(twoSum(nums, target));
    }
    public static boolean twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length; i++){
            int currentNumber = nums[i];
            if( map.containsKey(currentNumber - target)){
               return true;
            }else {
                map.put(currentNumber,1);
            }
        }
        return false;
    }

}
