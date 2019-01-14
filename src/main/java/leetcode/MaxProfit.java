package leetcode;

/**
 * @project q
 * @authore dgunda on 12/13/18
 */
public class MaxProfit {
    public static void main(String[] args) {
        int[] input = {7,1,5,3,6,4};
        System.out.println(getMaxProfit(input));
    }

    public static int getMaxProfit(int[] prices) {
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            profit = profit+(getmaxValue(prices,i) - prices[i]);
        }
        return profit;
    }
    public static int getmaxValue(int[] prices, int currentIndex){
        int max=0;
        for(int i=currentIndex;i<prices.length;i++){
            max = Math.max(max, prices[i]);
        }
        return max;
    }
}

