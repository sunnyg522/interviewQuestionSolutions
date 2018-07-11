package dynamicprog;

/**
 * @project q
 * @authore dgunda on 7/5/18
 */
public class ComputNcrpercentilp {
    public static void main(String[] args) {
        System.out.println(computeNcrPercentil(10, 2,13));
    }

    public static int computeNcr(int n, int k){
        if(k==0 || k==n)
            return 1;
        return computeNcr(n-1,k-1)+computeNcr(n-1,k);
    }

    public static int computeNcrPercentil(int n, int k, int p){
        return computeNcr(n, k) % p;
    }
}
