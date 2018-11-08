package leetcode;

/**
 * @project q
 * @authore dgunda on 11/5/18
 */
public class ClimbingStairs_70 {
    public static void main(String[] args) {
        System.out.println(climbStais(0,5));
        System.out.println(climbStairsDp(0,5));
    }public static int climbStais(int i, int n){
        if (i>n)
            return 0;
        if (i==n)
            return 1;
        return climbStais(i+1,n)+climbStais(i+2,n);
    }

    public static int climbStairsDp(int j, int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i =3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
