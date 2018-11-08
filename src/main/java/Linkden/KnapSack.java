package Linkden;

/**
 * @project q
 * @authore dgunda on 10/13/18
 */
public class KnapSack {
    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int weight = 50;
        System.out.println(maxWeight(50,wt,val,wt.length));
    }

    public static int maxWeight(int W, int wt[], int[] val, int n){
        int x[][] = new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W; j++){
                if(i==0 || j==0)
                    x[i][j] = 0;
                else if(wt[i-1]<=j){
                    x[i][j] = Math.max(val[i-1]+x[i-1][j-wt[i-1]],x[i-1][j]);
                }
                else
                    x[i][j] = x[i-1][j];
            }
        }
        return x[n][W];
    }
}
