package leetcode;

/**
 * @project q
 * @authore dgunda on 11/6/18
 */
public class BestTimeToBuyAndSellStocks_121 {
    public static void main(String[] args) {
        int[] stocks ={7,6,4,3,1};
        System.out.println(maxProfitOfStocks(stocks));
    }
    public static int maxProfitOfStocks(int[] stocks){
        int minStock = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0;i<stocks.length;i++){
            int currentStock = stocks[i];
            minStock = Math.min(minStock, currentStock);
            maxProfit = Math.max(currentStock-minStock, maxProfit);
        }
        return maxProfit;
    }
}
