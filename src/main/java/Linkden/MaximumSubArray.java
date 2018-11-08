package Linkden;

/**
 * @project q
 * @authore dgunda on 10/10/18
 */
public class MaximumSubArray {
    public static void main(String[] args) {
        int[] testInput ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(testInput));
    }
    public static int maxSubArray(int[] arr){
        int maxSum = arr[0];
        int currentSum = arr[0];
        for(int i=0;i<arr.length;i++){
            currentSum = Math.max(currentSum+1, currentSum);
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}
