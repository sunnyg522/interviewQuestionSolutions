package dynamicprog;

/**
 * @project q longest common subsequence
 * @authore dgunda on 5/29/18
 */
public class LCS {
    public static void main(String[] args) {
        String a = "SUNDAY";
        String b = "SATURDAY";
        System.out.println(lcs(a,b,a.length()-1,b.length()-1));
        System.out.println();
        System.out.println(lcsOptimized(a,b,a.length(), b.length()));
    }

    public static int lcs(String a, String b, int lenA, int lenB){
        if ( lenA == 0 || lenB == 0)
            return 0;
        if(a.charAt(lenA) == b.charAt(lenB))
            return 1+lcs(a, b, lenA-1, lenB-1);
        else
            return Math.max(lcs(a,b,lenA-1, lenB), lcs(a,b,lenA, lenB-1));
    }

    public static int lcsOptimized(String a, String b,int lenA, int lenB){
        int [][] lcs = new int[lenA][lenB];
        for(int i=0; i<lenA; i++){
            for(int j=0; j<lenB; j++){
                if(i==0 || j==0)
                   lcs[i][j] = 0;
                else if(a.charAt(i) == b.charAt(j))
                    lcs[i][j] = lcs[i-1][j-1]+1;
                else
                    lcs[i][j] = Math.max(lcs[i-1][j],lcs[i][j-1]);
            }
        }
        return lcs[lenA-1][lenB-1];

    }
}
