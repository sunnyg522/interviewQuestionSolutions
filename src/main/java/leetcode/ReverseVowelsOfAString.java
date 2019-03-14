package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @project q
 * @authore dgunda on 2019-03-12
 */
public class ReverseVowelsOfAString {
    public static void main(String[] args) {

    }
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int lo = 0;
        int hi = s.length()-1;
        char[] arr = s.toCharArray();
        while (lo<=hi){
            if(!set.contains(arr[lo])){
                lo++;
            }
            if(!set.contains(arr[hi]))
                hi++;
            char t = arr[lo];
            arr[hi]=arr[lo];
            arr[lo]=t;

            lo++;
            hi--;
        }
        return new String(arr);
    }
}
