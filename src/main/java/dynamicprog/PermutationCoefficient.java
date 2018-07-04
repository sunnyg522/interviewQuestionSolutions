package dynamicprog;

/**
 * @project q
 * @authore dgunda on 7/3/18
 */
public class PermutationCoefficient {
    public static void main(String[] args) {
        System.out.println(perCoeff(10,2));
        System.out.println(pefCoeffDP(10,2));
    }
    public static int perCoeff(int n, int k){
        int fact[] = new int[n+1];
        fact[0] = 1;
        for(int i=1;i<=n;i++){
            fact[i] = i*fact[i-1];
        }
        return fact[n]/fact[n-k];
    }

    //O(n) time and  O(1) space
    public static int pefCoeffDP(int n, int k){
        int fact = 1;
        for(int i=n;i>n-k;i--){
            fact = fact*i;
        }
        return fact;
    }
}
