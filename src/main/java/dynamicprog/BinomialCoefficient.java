package dynamicprog;

/**
 * Addition fo adj colums to get the ans
 *                         1
 *                        1 1
 *                       1 2 1
 *                      1 3 3 1
 *                     1 4 6 4 1
 *                    1 5 10 10 5 1
 * @project q
 * @authore dgunda on 7/3/18
 */
public class BinomialCoefficient {
    public static void main(String[] args) {
        System.out.println(binomialCoeffeciant(5,2));
        System.out.println(binomialCoeffUsingDPBottomup(5,4));
    }
    public static int binomialCoeffeciant(int n, int k){
        if(k==0 || k==n)
            return 1;
        return binomialCoeffeciant(n-1,k-1)+binomialCoeffeciant(n-1,k);
    }

    public static int binomialCoeffUsingDPBottomup(int n, int k){
        int c[][] = new int[n+1][k+1];
        c[0][0] = 1;
        for (int i=0; i<=n ; i++){
            for (int j=0; j<=Math.min(i,k);j++){
                if(j==0 || j==i){
                    c[i][j] = 1;
                }else {
                    c[i][j] = c[i-1][j-1]+c[i-1][j];
                }
            }
        }
        return c[n][k];
    }
}
