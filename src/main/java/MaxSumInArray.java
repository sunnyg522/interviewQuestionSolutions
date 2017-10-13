/**
 * Created by dgunda on 9/21/17.
 */
public class MaxSumInArray {
    public static void main(String[] args) {
        int[] testInput ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(getMaxSumSubArray(testInput));
    }
    public static int getMaxSumSubArray(int[] inputArray){
        int newSum = inputArray[0];
        int maxSum = inputArray[0];
        for(int i =0; i<inputArray.length; i++){
            newSum = Math.max(newSum+inputArray[i], inputArray[i]);
            maxSum = Math.max(newSum, maxSum);
        }
        return maxSum;
    }
}
