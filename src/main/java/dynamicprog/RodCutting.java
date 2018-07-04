package dynamicprog;

/**
 * @project q
 * @authore dgunda on 6/13/18
 */

/**
 * Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller than n.
 * Determine the maximum value obtainable by cutting up the rod and selling the pieces. For example,
 * if length of the rod is 8 and the values of different pieces are given as following,
 * then the maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)
 */
public class RodCutting {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
//        System.out.println("Maximum Obtainable Value is " +
//                cutRod(arr, size));
        System.out.println("Maximum Obtainable Value is " +
                cutRodRecursion(arr, size));
    }
    public static int cutRod(int[] prices, int n){
        int val[] = new int[n+1];
        val[0] = 0;


        for(int i=1; i<=n; i++){
            int maxPrice = Integer.MIN_VALUE;
            for (int j=0 ; j<i; j++){
                maxPrice = Math.max(maxPrice, prices[j]+val[i-j-1]);
                val[i] = maxPrice;
            }
        }
        return val[n];
    }

    public static int cutRodRecursion(int[] prices, int n){
        if (n <= 0)
            return 0;
        int maxValue = 0;
        for (int i =0 ; i<n; i++){
            maxValue = Math.max(maxValue ,prices[i]+cutRodRecursion(prices, n-i-1));
        }
        return maxValue;
    }
}

