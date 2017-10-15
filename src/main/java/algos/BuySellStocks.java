package algos;

/**
 * Created by dgunda on 9/21/17.
 */
public class BuySellStocks {
    public static void main(String[] args) {
        int[] testInput  = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(testInput));
    }
    public static int maxProfit(int[] stockPrices){
        if(stockPrices == null )
            throw  new NullPointerException("input is null");
        int minStockPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int currentPrice:stockPrices) {
            if(currentPrice<minStockPrice)
                minStockPrice = currentPrice;
            else if(currentPrice - minStockPrice > maxProfit)
                maxProfit = currentPrice - minStockPrice;
        }
        return maxProfit;

        }
}
