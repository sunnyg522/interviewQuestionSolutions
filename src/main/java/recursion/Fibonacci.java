package recursion;

/**
 * @project q
 * @authore dgunda on 4/3/18
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
    }
    public static int fib(int n){
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
}
