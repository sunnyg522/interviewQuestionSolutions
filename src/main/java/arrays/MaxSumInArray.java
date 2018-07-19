package arrays;

/**
 * @project q
 * @authore dgunda on 7/18/18
 */
public class MaxSumInArray {
    public static void main(String[] args) {
        int[] testInput ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(testInput));
    }
    public static int maxSum(int[] in){
        int newsum = in[0];
        int maxsum = in[0];
        for (int i=0;i<in.length;i++){
            newsum = Math.max(newsum+in[i], in[i]);
            maxsum = Math.max(maxsum,newsum);

        }
        return maxsum;
    }
}
