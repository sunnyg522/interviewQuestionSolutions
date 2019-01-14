package leetcode.bitwise;

/**
 * @project q
 * @authore dgunda on 12/16/18
 */
public class SmallestPowerOf2GreaterThanOrEqualToN {
    public static void main(String[] args) {
        System.out.println(getPwd2GreaterThanN(5));
    }
    public static int getPwd2GreaterThanN(int n){
        if((n>0 && (n&(n-1)) == 0))
            return n;
        int count = 0;
        while (n!=0){
            count++;
            n>>=1;
        }
        return 1<<count;
    }
}
