import java.util.HashMap;
import java.util.Stack;

/**
 * Created by dgunda on 9/19/17.
 */
public class BalancedBraces {
    public static void main(String[] args) {
        String testInput = "{[[[]]]}";
        System.out.println(isBalanceBrackets(testInput));
    }
    public static boolean isBalanceBrackets(String input){
        HashMap<Character, Character> mapBraces = new HashMap<Character, Character>();
        mapBraces.put('[',']');
        mapBraces.put('{','}');
        mapBraces.put('(',')');
        if(input == null)
            return false;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if( mapBraces.containsKey(c)){
                stack.push(c);
            }else if(stack.peek() != null && mapBraces.get(stack.peek()) !=  c) {
                char temp = stack.pop();
            }else {
                return false;
            }
        }
        return true;

    }

}
