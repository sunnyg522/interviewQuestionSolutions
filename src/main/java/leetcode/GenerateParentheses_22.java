package leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 11/25/18
 */
public class GenerateParentheses_22 {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans,0,0,"",n);
        return ans;

    }
    public static void backtrack(List<String> ans, int close, int open, String current, int max){
        if(current.length() == max*2){
            ans.add(current);
            return;
        }
        if(open<max){
            backtrack(ans,close,open+1,current+"(",max);
        }
        if(close<open){
            backtrack(ans,close+1,open,current+")",max);
        }
    }
}
