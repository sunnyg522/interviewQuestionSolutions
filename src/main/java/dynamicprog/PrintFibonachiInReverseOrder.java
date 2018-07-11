package dynamicprog;

/**
 * @project q
 * @authore dgunda on 7/7/18
 */
public class PrintFibonachiInReverseOrder {
    public static void main(String[] args) {
        System.out.println(printFibonachinInReverseOrder(5));
    }
    public static int printFibonachinInReverseOrder(int n){
        if (n==0||n==1)
            return 1;
        return  printFibonachinInReverseOrder(n-2)+printFibonachinInReverseOrder(n-1);
    }
}
