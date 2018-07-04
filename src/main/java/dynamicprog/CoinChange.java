package dynamicprog;

/**
 * @project q
 * @authore dgunda on 6/26/18
 */
public class CoinChange {
    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 6};
        int m = arr.length;
        System.out.println(coins(arr, m, 10));
        System.out.println(coinsDP(arr,10,m));
    }

    // non optimal
    public static int coins(int s[], int m, int n ){
        if (n < 0)
            return 0;
        if(n == 0)
            return 1;
        // If there are no coins and n
        // is greater than 0, then no
        // solution exist
        if (m <=0 && n >= 1)
            return 0;

        return coins(s,m-1,n)+coins(s, m, n-s[m-1]);
    }

    // this one using bottom up approch
    public static int coinsDP(int s[], int sum, int m){
       int total[] = new int[sum+1];
       total[0] = 1;
       for (int i=0;i<m;i++){
           for(int j=s[i];j<=sum;j++){
               total[j] += total[j-s[i]];
           }
       }
        return total[sum];
    }
}
