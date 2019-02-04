package leetcode;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 2/3/19
 */
public class TwoSum_II {
    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(input,9)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int i=0, j = numbers.length-1;
        while (i<j){
            int temp = numbers[i]+numbers[j];
            if(temp == target){
                return  new int[]{i+1, j+1};
            }else if(temp>target){
                j--;
            }else{
                i++;
            }
        }
        throw new IllegalArgumentException("No two sum");
    }
}
