package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @project q
 * @authore dgunda on 2019-06-12
 */
public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        String[] mcode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String word: words){
            StringBuilder sb = new StringBuilder();
            word = word.toLowerCase();
            for(int i=0;i<word.length();i++){
                sb.append(mcode[word.charAt(i)-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
