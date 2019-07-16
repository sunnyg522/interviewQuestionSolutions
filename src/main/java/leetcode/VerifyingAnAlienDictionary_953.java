package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @project q
 * @authore dgunda on 2019-06-17
 */
public class VerifyingAnAlienDictionary_953 {
    public static void main(String[] args) {
        System.out.println(isAlienSorted(new String[]{"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
    }
    public static boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> dict = new HashMap<>();
        for(int i=0;i<order.length();i++){
            dict.put(order.charAt(i), i);
        }
        for(String word: words){
            for(int i=1;i<word.length();i++){
                if(dict.get(word.charAt(i))<dict.get(word.charAt(i-1))){
                    return false;
                }
            }
        }
        return true;
    }
}
