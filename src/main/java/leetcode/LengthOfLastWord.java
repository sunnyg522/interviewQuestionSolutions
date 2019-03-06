package leetcode;

/**
 * @project q
 * @authore dgunda on 2/17/19
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
    public static int lengthOfLastWord(String s) {
        boolean flag = false;
        int lastVal = s.length() - 1;
        int result = 0;
        for(int i = lastVal; i>= 0; i--){
            char c = s.charAt(i);
            if(c>='a'&& c<= 'z' || c>='A' && c<='Z'){
                flag = true;
                result++;
            }else if(flag)
                return result;
        }
        return result;
    }
}
