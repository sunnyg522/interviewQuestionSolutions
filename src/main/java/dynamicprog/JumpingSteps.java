package dynamicprog;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 6/27/18
 */
public class JumpingSteps {
    public static void main(String[] args) {
        System.out.println(countNumberOfWays(3));

    }
    public static int countNumberOfWays(int n){
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        return countNumberOfWays(n, memo);
    }

    public static int countNumberOfWays(int n, int[] memo){
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        else if (memo[n]>-1)
            return memo[n];
        else {
            memo[n] = countNumberOfWays(n-1, memo)+countNumberOfWays(n-2,memo)+countNumberOfWays(n-3, memo);
            return memo[n];
        }
    }
}
