package leetcode;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 2/3/19
 */
public class ReverseStringII {

    public static String reverseWord(char[] s){
       int i=0;
       for (int j=0;j<s.length;j++){
           if(s[j] ==' '){
               reverese(s,i, j-1);
               i=j+1;
           }
       }
       reverese(s,i,s.length-1);
       reverese(s,0,s.length-1);
       return new String(s);

    }
    public static void reverese(char[] ch, int i, int j){
        while (i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        ;
        System.out.println(reverseWord(s.toCharArray()));
    }
}
