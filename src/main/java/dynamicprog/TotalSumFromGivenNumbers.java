package dynamicprog;


import java.util.Arrays;

/**
 *
 * Given 3 numbers {1, 3, 5}, we need to tell
 * the total number of ways we can form a number 'N'
 * using the sum of the given three numbers.
 * (allowing repetitions and different arrangements).
 * @project q
 * @authore dgunda on 6/26/18
 */
public class TotalSumFromGivenNumbers {
    static Integer[] state = new Integer[10];
    public static void main(String[] args) {
        Arrays.fill(state,-1);
        System.out.println(totalSum(7));
    }
    public static int totalSum(int n){
        if(n < 0)
            return 0;
        if(n == 1)
            return 1;
        if(state[n] !=-1)
            return state[n];
        return state[n] =  totalSum(n-1)+totalSum(n-3)+totalSum(n-5);
    }
}
