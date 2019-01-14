package leetcode;

/**
 * @project q
 * @authore dgunda on 12/13/18
 */
public class RemovinStones {
    public static void main(String[] args) {
        //System.out.println(remove(4));
        String s = "test";
        if(s.charAt(0) == s.charAt(3)){
            System.out.println(true);
        }
    }
//    public static boolean remove(int n){
//        int[] dp = new int[n+1];
//        dp[0]= 0;
//        for(int i=4;i<=n;i++){
//            dp[i] = dp[i-1] && dp[i-2];
//        }
//        return dp[n];
//    }
}
