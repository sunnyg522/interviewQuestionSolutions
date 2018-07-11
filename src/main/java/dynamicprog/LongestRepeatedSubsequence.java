package dynamicprog;

import java.util.Arrays;

/**
 * Given a string, print the longest repeating subsequence such that the two subsequence don’t have
 * same string character at same position, i.e., any i’th character in the two subsequences shouldn’t
 * have the same index in the original string.
 * Input: str = "aabb"
 * Output: "ab"
 *
 * @project q
 * @authore dgunda on 7/7/18
 */
public class LongestRepeatedSubsequence {
    public static void main(String[] args) {
        String s = "aabb";
        String s2= "AABEBCDD";
        System.out.println(lrs(s2,s.length(),s.length() ));
        System.out.println(lrsDP(s2));
    }
    public static int lrs(String s, int m, int n){
        if(m==0||n==0)
            return 0;

        if(s.charAt(m-1) == s.charAt(n-1) && m!=n)
            return 1+lrs(s,m-1,n-1);
        else
            return Math.max(lrs(s,m-1,n),lrs(s,m,n-1));
    }
    public static int lrsDP(String s){
        int m = s.length();
        int mem[][] = new int[m+1][m+1];

        for (int i =0;i<=m;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0)
                    mem[i][j]=0;
                else if(s.charAt(i-1) == s.charAt(j-1) && i!=j)
                    mem[i][j] = 1+mem[i-1][j-1];
                else
                    mem[i][j] = Math.max(mem[i-1][j], mem[i][j-1]);
            }
        }
        printLRS(mem,s,mem[m][m]);
        return mem[m][m];
    }

    public static void printLRS(int[][] mem, String input, int subSeqLen){
        int i = mem.length-1;
        int j = mem.length-1;
        StringBuilder sb = new StringBuilder();
        while (i >0 && j >0){
            if(mem[i][j] == mem[i-1][j-1]+1){
                sb.append(input.charAt(i-1));
                i--;
                j--;
            }else if(mem[i][j] == mem[i-1][j])
                i--;
            else
                j--;
        }
        System.out.println(sb.reverse());
    }

}
