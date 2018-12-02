package leetcode;

/**
 * @project q
 * @authore dgunda on 11/20/18
 */
public class LongestPalindromeSubstring_5 {
    public static void main(String[] args) {
        System.out.println(longerstPalindrome("babad"));
    }

    public static String longerstPalindrome(String s){
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for(int i=0; i<s.length();i++){
            int len1 = expandAroundCenters(s, i, i);
            int len2 = expandAroundCenters(s, i, i+1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end+1);
    }
    public static int expandAroundCenters(String s, int left, int right){
        int L= left, R= right;
        while (L>=0 && R<s.length()&& s.charAt(L) == s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
}
