package dynamicprog;

/**
 * @project q
 * @authore dgunda on 7/7/18
 */
public class LongestCommongSubString {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(lcs(s1,s2,s1.length(),s2.length()));
        System.out.println(lcsDP(s1,s2,s1.length(),s2.length()));
    }
    public static int lcs(String a, String b, int m, int n){
        if( m==0 || n==0)
            return 0;
        if(a.charAt(m-1) == b.charAt(n-1))
            return 1+lcs(a,b,m-1,n-1);
        else
            return Math.max(lcs(a,b,m-1,n),lcs(a,b,m,n-1));
    }

    public static int lcsDP(String a, String b, int m, int n){
        int mem[][] = new int[m+1][n+1];
        for (int i=0; i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0)
                    mem[i][j] = 0;
                else if(a.charAt(i-1) == b.charAt(j-1))
                    mem[i][j] = 1+mem[i-1][j-1];
                else
                    mem[i][j] = Math.max(mem[i-1][j],mem[i][j-1]);
            }
        }
        printLCS(a,b,m,n,mem);
        return mem[m][n];
    }

    public static void printLCS(String a, String b, int m, int n, int[][] mem){
        StringBuilder sb = new StringBuilder();
        while (m >0 && n>0){
            if(mem[m][n] == mem[m-1][n-1] +1) {
                sb.append(a.charAt(m - 1));
                m--;
                n--;
            }
            else if(mem[m][n] == mem[m-1][n])
                m--;
            else
                n--;
        }
        System.out.println(sb.reverse());
    }
}
