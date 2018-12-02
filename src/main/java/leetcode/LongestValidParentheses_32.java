package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @project q
 * @authore dgunda on 11/25/18
 */
public class LongestValidParentheses_32 {
    public static void main(String[] args) {
        System.out.println(longestValidParWithoutExtraDS("(()"));
        System.out.println(longestValidParUsingStack("()()"));
    }
    public static int longestValidParUsingStack(String s){
        // Using single stack, store the index value in stack and take a diff when closing brace is encountered.
        int maxValue =0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='(')
                stack.push(i);
            else{
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxValue = Math.max(maxValue, i - stack.peek());
                }
            }

        }
        return maxValue;
    }

    public static int longestValidParWithoutExtraDS(String s){
        //scan from left to right and check count open and close par take a diff when they are equal and repeat the
        // process from right to left.
        int leftPar = 0, rightPar=0, maxLength = 0;
        if(s.length() == 0)
            return 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(')
                leftPar++;
            else
                rightPar++;
            if(leftPar == rightPar)
                maxLength = Math.max(maxLength, 2*rightPar);
            else if(rightPar >= leftPar)
                rightPar = leftPar = 0;
        }
        // traverse through left side.
        leftPar = rightPar = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == '(')
                leftPar++;
            else
                rightPar++;
            if(leftPar == rightPar)
                maxLength = Math.max(maxLength, 2*leftPar);
            else if(leftPar >= rightPar)
                rightPar = leftPar = 0;
        }
        return maxLength;
    }
}
