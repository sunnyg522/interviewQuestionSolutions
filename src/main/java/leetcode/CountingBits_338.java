package leetcode;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 12/17/18
 */
public class CountingBits_338 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBit(5)));
    }
    public static int[] countBit(int a){
        int[] dp = new int[a+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=a;i++){
            if((i&i-1)==0)
                dp[i] =1;
            else
                dp[i]=dp[i-1]+1;
        }
        return dp;

    }
}
