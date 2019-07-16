package arrays;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 7/18/18
 */
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] input = {0,0};
        System.out.println(Arrays.toString(productOfArrayexcSelf(input)));
    }
    public static int[] productOfArrayexcSelf(int[] nums){
        int length = nums.length;
        int[] answer = new int[nums.length];

        answer[1] = 1;
        for(int i=1; i<length;i++){
            answer[i] = answer[i-1]*nums[i-1];
        }
        int R = 1;
        for(int i=length -1; i>0;i--){
            answer[i] = answer[i]* R;
            R *=nums[i];
        }
        return  answer;
    }
}
