package dynamicprog;

/**
 * @project q
 * @authore dgunda on 6/25/18
 */
public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fibDP(5));
    }
    public static int fib(int n){
        if(n==0 || n==1 || n<0)
            return 1;
        else
            return  fib(n-2)+fib(n-1);

    }

    public static  int[] f = new int[15];
    public static  int fibDP(int n){
        f[0] = 1;
        f[1] = 1;
        for(int i =2; i<=n; i++){
            f[i] = f[i-1] +f[i-2];
        }
        return f[n];
    }

}
