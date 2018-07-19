package dynamicprog;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
 * stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security
 * system connected and it will automatically contact the police if two adjacent houses were broken into
 * on the same night.
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 *
 * @project q
 * @authore dgunda on 7/18/18
 */
public class HouseRobber {
    public static void main(String[] args) {
        int[] input = {50,1,1,50};
        System.out.println(getMaxValue(input));
    }

    public static int getMaxValue(int[] in){
        if(in == null || in.length == 0)
            return 0;
        if(in.length==1)
            return in[0];
        int[] dp = new int[in.length];
        dp[0] = in[0];
        dp[1] = Math.max(dp[0],in[0]);
        for(int i=2;i<in.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+in[i]);
        }
        return dp[in.length-1];
    }
}
