package dynamicprog;

/**
 *
 * The first few terms of the sequence are  1, 3, 7, 17, 41, 99, ….
 * Input : n = 3
 * Output : 7
 * Sn = 2* Sn-1 + Sn-2
 * @project q
 * @authore dgunda on 7/6/18
 */
public class NewmanShanksWilliamsPrime {
    public static void main(String[] args) {
        System.out.println(getNthNewmanShanksWilliamPrime(3));
        System.out.println(nswpDP(3));
    }

    public static int getNthNewmanShanksWilliamPrime(int n){
        if(n==0 || n ==1)
            return 1;
        return 2*getNthNewmanShanksWilliamPrime(n-1)+getNthNewmanShanksWilliamPrime(n-2);
    }

    public static int nswpDP(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2;i<=n;i++){
            dp[i] = 2*dp[i-1]+dp[i-2];
        }
        return dp[n];

    }

}
