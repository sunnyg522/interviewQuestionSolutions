package leetcode;

import java.util.Stack;

/**
 * @project q
 * @authore dgunda on 2019-06-05
 */
public class RemoveAllAdjacentDuplicatesInString_1047 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String S) {
        if (S == null || S.length() < 2) {
            return S;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<S.length();i++){
            if(stack.isEmpty() || stack.peek() != S.charAt(i)){
                stack.push(S.charAt(i));
            }else
                stack.pop();
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();

    }
}
