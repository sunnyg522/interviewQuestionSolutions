package leetcode;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 12/5/18
 */
public class SortColors_75 {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int low =0;
        int mid =0;
        int high = nums.length-1;
        while (mid<=high){
            if(nums[mid]==0){
                swap(low, mid, nums);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else {
                swap(mid, high, nums);
                high--;
            }
        }
    }
    public static void swap(int i, int j, int[]arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
