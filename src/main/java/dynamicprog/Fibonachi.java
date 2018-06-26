package dynamicprog;

/**
 * @project q
 * @authore dgunda on 6/25/18
 */
public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    public static int fib(int n){
        if(n==0 || n==1 || n<0)
            return 1;
        else
            return  fib(n-2)+fib(n-1);

    }
}
