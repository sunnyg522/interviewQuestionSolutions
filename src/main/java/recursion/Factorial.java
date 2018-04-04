package recursion;

/**
 * @project q
 * @authore dgunda on 4/3/18
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(3));
        System.out.println(fact(4));
    }
    public  static int fact(int n){
        if(n<=1)
            return 1;
        return n*fact(n-1);
    }
}
