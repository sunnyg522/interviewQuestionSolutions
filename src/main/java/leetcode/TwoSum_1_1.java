package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @project q
 * @authore dgunda on 2/3/19
 */
public class TwoSum_1_1 {
    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(input, 9)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{ map.get(target-nums[i]), i};
            }map.put(nums[i], i);

        }
        throw new IllegalArgumentException(" No two sum solution");
    }
}
