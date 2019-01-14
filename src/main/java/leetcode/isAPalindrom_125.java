package leetcode;

/**
 * @project q
 * @authore dgunda on 12/16/18
 */
public class isAPalindrom_125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
    public static boolean isPalindrome(String s) {
        int f = 0;
        int b = s.length()-1;
        while(f<b){
            if(!(s.charAt(f) >= 'a' && s.charAt(f) <= 'Z')){
                f++;
            }else if(!(s.charAt(b) >= 'a' && s.charAt(b) <= 'Z')){
                b--;
            }else if(s.charAt(b) == s.charAt(f)){
                f++;
                b--;
            }else if (s.charAt(b) != s.charAt(f)){
                return false;
            }
        }
        return true;
    }
}
