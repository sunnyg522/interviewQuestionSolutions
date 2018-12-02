package leetcode;

import java.util.*;

/**
 * @project q
 * @authore dgunda on 11/25/18
 */
public class ValidParentheses_20 {
    public static void main(String[] args) {
        System.out.println(isValidParantheses("()[]{}"));
    }
    public static boolean isValidParantheses(String str){
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[',']');
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                stack.push(str.charAt(i));
            }else {
                char c = stack.pop();
                if(map.get(c) != str.charAt(i))
                    return false;
            }

        }
        return true;
    }
}
