package leetcode;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 2019-06-10
 */
public class ReverseOnlyLetters_917 {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
    }
    public static String reverseOnlyLetters(String S) {
        int right= 0;
        int left = S.length()-1;
        char[] arr = S.toCharArray();
        while(right<=left){
            char currntRight = arr[right];
            while(right<left && !Character.isLetter(S.charAt(right))){
                right++;
            }
            char currentLeft = arr[left];
            while(right<left && !Character.isLetter(S.charAt(left))){
                left--;
            }
            swap(arr, right, left);
            right++;
            left--;
        }
        return new String(arr);
    }
    public static char[] swap(char[] arr, int a, int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}
