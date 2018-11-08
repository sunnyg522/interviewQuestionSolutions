package Linkden;

/**
 * @project q
 * @authore dgunda on 10/10/18
 */
public class Pow_M_N {
    public static void main(String[] args) {
        System.out.println(pow(2,-3));
    }
    public static float pow( float m, int n){
        float temp;
        if(n==0)
            return 1;
        temp = pow(m,n/2);
        if(n%2==0)
            return temp*temp;
        else {
            if(n>0)
                return m*temp*temp;
            else
                return temp*temp/m;
        }

    }

}
