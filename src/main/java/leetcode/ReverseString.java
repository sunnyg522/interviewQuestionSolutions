package leetcode;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 2019-06-04
 */
public class ReverseString {
    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
    }
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left< right){
            swap(s, left, right);
            right--;
            left++;
        }
        System.out.println(Arrays.toString(s));
    }
    public static void swap(char[] s, int left, int right){
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
}
