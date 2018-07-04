package dynamicprog;

/**
 * Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired
 * only once. Find out the total number of ways in which friends can remain single or can be paired up.
 * @project q
 * @authore dgunda on 7/3/18
 */
public class FriendsPairing {
    public static void main(String[] args) {
        System.out.println(totalPairs(3));
    }

    // 1.) f(n) ppl can be single or nth person can be pared with n-1 remaining frnds;
    // Recursion will be f(n) = f(n-1) + (n-1) f(n-2)
    public static int totalPairs(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        return dp[n];
    }
}
