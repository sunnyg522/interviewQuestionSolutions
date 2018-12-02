package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @project q
 * @authore dgunda on 11/19/18
 */
public class LongestSubstringWithoutRepeatingCharacters_3 {
    public static void main(String[] args) {
        System.out.println(getLongStrWithoutRep("bbbbb"));
    }
    public static int getLongStrWithoutRep(String s){
        Set<Character> ch = new HashSet<>();
        int currentSize = 0;
        int maxSize = Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++){
            if(!ch.contains(s.charAt(i))){
                ch.add(s.charAt(i));
                currentSize++;
            }else{
                maxSize = Math.max(currentSize, maxSize);
                currentSize = 0;
                ch.clear();
            }
        }
        return maxSize;
    }
}
