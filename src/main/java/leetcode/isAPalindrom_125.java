package leetcode;

/**
 * @project q
 * @authore dgunda on 12/16/18
 */
public class isAPalindrom_125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Red rum, sir, is murder"));
    }
    public static boolean isPalindrome(String s) {
        if(s==null||s.length()==0) return false;
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }
}
