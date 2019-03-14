package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-03-07
 */
public class ShortestPalindrome_214 {
    public static void main(String[] args) {
        System.out.printf(shortestPalindrome("aacecaaa"));
    }
    public static String shortestPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
            }
            r--;
        }
        if(l == s.length())
            return s;
        String suffix = s.substring(l);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String mid =  shortestPalindrome(s.substring(0,l));
        return prefix+mid+suffix;
    }
}
