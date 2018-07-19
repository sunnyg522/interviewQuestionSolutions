package dynamicprog;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 7/11/18
 */
public class CoinChange {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int m = arr.length;
        int n = 4;
        System.out.println(coinChange(arr, n,m));
    }
    public static int coinChange(int[] coins, int total, int m){
        int mem[] = new int[total+1];
        Arrays.fill(mem,Integer.MAX_VALUE);
        mem[0] = 0;
        for(int i=1;i<=total;i++){
            for(int j=0;j<m;j++){
                if(coins[j]<=i) {
                    int subRes = mem[i - coins[j]];
                    if (subRes != Integer.MAX_VALUE && subRes + 1 < mem[i])
                        mem[i] = subRes + 1;
                }
            }
        }
        return mem[total];
    }

}
