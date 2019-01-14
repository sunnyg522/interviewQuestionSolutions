package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 12/8/18
 */
public class RemoveDuplicatesfromSortedArray_26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        int front=0;
        int back=0;
        while(front<nums.length){
            if(nums[front] == nums[back]){
                front++;
            }else {
                nums[++back] = nums[front];
            }
        }
        System.out.println(Arrays.toString(nums));
        return back+1;
    }
}
