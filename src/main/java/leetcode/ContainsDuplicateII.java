package leetcode;

import java.util.HashMap;

/**
 * @project q
 * @authore dgunda on 2/17/19
 */
public class ContainsDuplicateII {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
        System.out.println(containsNearByDuplicate(new int[]{1,0,1,1}, 1));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length< 2)
            return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int prev = map.get(nums[i]);
                if(i-prev<=k)
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
    public static boolean containsNearByDuplicate(int[] nums, int k){
        if(nums == null || nums.length< 2)
            return false;
        for (int i=nums.length-1;i>k;i++){
            int temp = i-k;
            if(nums[temp] == nums[i])
                return true;
        }

        return false;
    }
}
