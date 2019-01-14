package leetcode;

/**
 * @project q
 * @authore dgunda on 12/13/18
 */
public class BestTimeToBuyAndSellStockII_122 {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        System.out.println(maxProfit(input));
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i=1;i<prices.length;i++) {
            if(prices[i]>prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }

}
