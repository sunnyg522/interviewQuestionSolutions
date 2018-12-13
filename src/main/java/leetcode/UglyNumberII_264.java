package leetcode;

/**
 * @project q
 * @authore dgunda on 12/7/18
 */
public class UglyNumberII_264 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
    public static int nthUglyNumber(int n) {
        int i=0;
        int ugleNumber = 1;
        int t = 0;
        if(n==1)
            return t;
        while(i<n){
            if((t%2==0)||(t%3==0)||(t%5==0)){
                i++;
                ugleNumber = t;
            }
            t++;
        }
        return ugleNumber;
    }
}
