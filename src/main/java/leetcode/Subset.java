package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @project q
 * @authore dgunda on 12/6/18
 */
public class Subset {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        int len = nums.length;
        for(int i=0;i<(1<<len);i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<len;j++){
                if((i&(1<<j))>0){
                    list.add(nums[j]);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
