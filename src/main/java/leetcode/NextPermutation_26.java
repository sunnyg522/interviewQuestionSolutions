package leetcode;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 12/12/18
 */
public class NextPermutation_26 {
    public static void main(String[] args) {
        int[] input = {3,2,1};
        nextPermutation(input);
        System.out.println(Arrays.toString(input));
    }
    public static void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while (i>=0 && (nums[i+1]<=nums[i])){
            i--;
        }
        System.out.println(i);
        if(i>=0){
            int j = nums.length-1;
            while (j>=0 && (nums[j]<=nums[i])){
                j--;
            }
            swap(nums,i,j);
        }
        reverese(nums,i+1);
    }
    public static void  reverese(int[] nums, int start){
        int end = nums.length-1;
        while (start<end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
