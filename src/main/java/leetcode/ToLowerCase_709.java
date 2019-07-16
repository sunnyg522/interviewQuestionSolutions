package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-06-19
 */
public class ToLowerCase_709 {
    public static void main(String[] args) {

    }
    public String toLowerCase(String str) {
        char[] c = str.toCharArray();
        for(int i = 0;i<c.length;i++){
            if('A'<=c[i] && c[i]<='Z'){
                c[i] = (char)(c[i]-'A'+'a');
            }
        }
        return c.toString();
    }
}
