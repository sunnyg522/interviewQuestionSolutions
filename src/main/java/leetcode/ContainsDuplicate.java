package leetcode;

import java.util.HashSet;

/**
 * @project q
 * @authore dgunda on 2/17/19
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
    }
    public static boolean containsDuplicate(int[] nums) {
        if(nums.length == 0 || nums == null)
            return false;
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            if(set.contains(i))
                return true;
            else
                set.add(i);
        }
        return false;
    }
}
