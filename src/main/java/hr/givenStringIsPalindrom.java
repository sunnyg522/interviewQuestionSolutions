package hr;


public class givenStringIsPalindrom {
    public static void main(String[] args) {
        String s = "pup";
        System.out.println(isPalindromM1(s));
        System.out.println(isPalindromM1("test"));
        System.out.println(isPalindromM2(s));
    }
    public static boolean isPalindromM1(String s){
        int i = 0;
        int j = s.length()-1;
        if(s.equals(null))
            throw new NullPointerException("emptry String");
        while (i == j || i<j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static boolean isPalindromM2(String s){
        return s.equals(new StringBuffer(s).reverse().toString());
    }
}
