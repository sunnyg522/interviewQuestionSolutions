package stringManipulation;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExpressionRev {
    /**
     * Reverse this string 1+2*3-20. Note: 20 must be retained as is.
     Expected output: 20-3*2+1

     */
    public static void main(String[] args) {
        String testInput = "1+2*3-20";
        System.out.println(reverseExpresssion(testInput));
    }
    public static String reverseExpresssion(String s){
        if(s.equals(null))
            throw new NullPointerException("Argument is null");
        Set<Character> n = new HashSet<Character>(Arrays.asList('+','-','/','*'));
        int i = s.length()-1;
        int j = s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i>=0)
        {
            if(n.contains(s.charAt(i))){
                sb.append(s.substring(i+1,j+1));
                sb.append(s.charAt(i));
                i--;
                j=i;
            }else{
                i--;
            }

        }
        sb.append(s.substring(i+1,j+1));

        return sb.toString();
    }
}
