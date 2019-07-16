package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-07-16
 */
public class RecursiveToIfGivenNumberIsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(6, 1, 0));
    }
    public static boolean isPrime(int num, int i, int j){
        if(j>2)
            return false;
        if(i==num && j<=2)
            return true;
        if(num%i == 0) {
            j++;
        }
        return isPrime(num, i+1, j);
    }
}
