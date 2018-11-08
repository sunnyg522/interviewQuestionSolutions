package leetcode;

/**
 * @project q
 * @authore dgunda on 11/5/18
 */
public class MaxSubArray_53 {
    public static void main(String[] args) {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(getMaxSubArray(input));
    }
    public static int getMaxSubArray(int[] input){

        int newSum = input[0];
        int maxSum = input[0];
        for(int i=0;i<input.length;i++){
            newSum = Math.max(newSum+input[i], input[i]);
            maxSum = Math.max(newSum,maxSum);
        }
        return maxSum;
    }
}
