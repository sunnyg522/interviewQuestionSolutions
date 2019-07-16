package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-07-09
 */
public class ValidPalindromeII_680 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("abc"));
    }
    public static boolean validPalindrome(String s) {
        int l = -1;
        int r = s.length();
        while (++l<r--){
            if(s.charAt(l)!=s.charAt(r))
                return isAPalindrom(s, l, r+1) || isAPalindrom(s, l-1,r);
        }
        return true;
    }

    public static boolean isAPalindrom(String s, int l, int r){
        while (++l<r--){
            if(s.charAt(l) !=s.charAt(r))
                return false;
        }
        return true;
    }
}
