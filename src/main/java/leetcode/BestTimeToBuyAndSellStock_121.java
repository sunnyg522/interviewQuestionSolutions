package leetcode;

import java.util.Stack;

/**
 * @project q
 * @authore dgunda on 12/13/18
 */
public class BestTimeToBuyAndSellStock_121 {
    public static class Stock{
        int min;
        int max;
        int diff;

        public  Stock(int min, int max, int diff){
            this.min = min;
            this.max = max;
            this.diff = diff;
        }
    }
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfitOpt(prices));
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        Stack<Stock> st = new Stack<>();
        int currentMin = Integer.MAX_VALUE;
        int currentMax = Integer.MIN_VALUE;
        for(int i=0; i<prices.length;i++){
            currentMin = Math.min(currentMin, prices[i]);
            currentMax = Math.max(currentMax,prices[i]);
            Stock stock = new Stock(currentMin,currentMax,prices[i]-currentMin);
            st.add(stock);
        }
        int maxProfit = Integer.MIN_VALUE;
        for(Stock s: st){
            maxProfit = Math.max(maxProfit, s.diff);

        }
        return  maxProfit;
    }
    public static int maxProfitOpt(int[] prices){
        int min = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++){
            min = Math.min(min, prices[i]);
            maxprofit = Math.max(maxprofit, prices[i]-min);
        }
        return maxprofit;
    }
}
