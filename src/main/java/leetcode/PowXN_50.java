package leetcode;

/**
 * @project q
 * @authore dgunda on 12/12/18
 */
public class PowXN_50 {
    public static void main(String[] args) {
        System.out.println(myPow(2,-4));
    }

    public static double myPow(double x, int n) {
       if(n<0)
           return 1.0/pow(x,n);
       else
           return pow(x,n);
    }
    public static double pow(double x, int n){
        if(n==0)
            return 1;
        double y = pow(x, n/2);
        if(n%2==0)
            return y*y;
        else
            return y*y*x;

    }

}
