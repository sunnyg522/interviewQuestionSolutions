package dynamicprog;

/**
 * Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total
 * value in the knapsack. In other words, given two integer arrays val[0..n-1] and wt[0..n-1]
 * which represent values and weights associated with n items respectively. Also given an integer
 * W which represents knapsack capacity, find out the maximum value subset of val[] such that sum
 * of the weights of this subset is smaller than or equal to W. You cannot break an item, either
 * pick the complete item, or don’t pick it (0-1 property).
 *
 * @project q
 * @authore dgunda on 7/11/18
 */
public class Knapsack {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int  W = 50;
        System.out.println(knapSack(val,wt,val.length,W));

    }
    public static int knapSack(int[] value, int[] weight, int m, int W){
        int[][] mem = new int[m+1][W+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=W;j++){
                if(i==0 || j==0)
                    mem[i][j] = 0;
                else if(weight[i-1] <= j)
                    mem[i][j] = Math.max(value[i-1]+mem[i-1][j-weight[i-1]],mem[i-1][j]);
                else
                    mem[i][j] = mem[i-1][j];
            }
        }
        return mem[m][W];
    }
}
