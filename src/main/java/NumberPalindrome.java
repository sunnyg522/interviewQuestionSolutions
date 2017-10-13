/**
 * Created by dgunda on 9/21/17.
 */
public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(2002));
    }
    public static boolean isPalindrome(int num){
        int revertedNumber = 0;
        int actualNumber = num;
        while (num >0){
            revertedNumber = revertedNumber*10 + num %10;
            num = num/10;
        }
        return revertedNumber == actualNumber ? true: false;
    }
}
