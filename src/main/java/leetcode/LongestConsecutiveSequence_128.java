package leetcode;

import java.util.HashSet;

/**
 * @project q
 * @authore dgunda on 2/17/19
 */
public class LongestConsecutiveSequence_128 {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;

        HashSet<Integer> map = new HashSet<>();
        int max = 1;
        for(int n: nums){
            map.add(n);
        }
        for(int n: nums){
            int right = n + 1;
            int left = n - 1;
            int count = 1;
            while (map.contains(right)){
                count++;
                map.remove(n);
                right++;
            }

            while (map.contains(left)){
                count++;
                map.remove(n);
                left--;
            }
            max = Math.max(max, count);
        }
        return max;
    }

}
