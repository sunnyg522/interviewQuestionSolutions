package dynamicprog;

/**
 * @project q
 * @authore dgunda on 7/2/18
 */
public class UglyNumber {
    public static void main(String[] args) {
        printUglyNumber(10);
    }
    public static void printUglyNumber(int n){
       int i =1;
       int count  = 1;
       while (n>count){
           i++;
           if (isUglyNumber(i)==1)
               count++;
       }
        System.out.println(i);
    }
    public static boolean isUgly(int n){
        return (n%2==0 || n%3==0 || n%4==0);
    }
    public static int isUglyNumber(int no){
        no = maxDivide(no, 2);
        no = maxDivide(no, 3);
        no = maxDivide(no, 5);

        return (no == 1)? 1 : 0;
    }

    public static int maxDivide(int a, int b){
        while(a % b == 0)
            a = a/b;
        return a;
    }
}
