package Linkden;

/**
 * @project q
 * @authore dgunda on 10/13/18
 */
public class LongestCommonSubSequence {
    public static void main(String[] args) {
        String a = "AGGTAB";
        String b = "GXTXAYB";
        int m = a.length();
        int n = b.length();
        System.out.println(lcs(m,n,a,b));
    }
    public static int lcs(int m, int n, String a, String b){
        int mem[][] = new int[m+1][n+1];
        for(int i =0; i<=m;i++){
            for(int j =0;j<=n;j++){
                if(i==0||j==0)
                    mem[i][j] = 0;
                else if(a.charAt(i-1) == b.charAt(j-1)){
                    mem[i][j] =1+mem[i-1][j-1];
                }
                else
                    mem[i][j] = Math.max(mem[i-1][j],mem[i][j-1]);
            }
        }
        return mem[m][n];
    }
}
