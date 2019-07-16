package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @project q
 * @authore dgunda on 2019-06-19
 */
public class SubarraySumEqualsK_560 {
    public static void main(String[] args) {

    }
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;

        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            if(map.containsKey(sum - k))
                count+= map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
