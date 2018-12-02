package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @project q
 * @authore dgunda on 11/19/18
 */
public class JewelsAndStones_771 {
    public static void main(String[] args) {
        System.out.println(coutJewels("aA", "aAAbbbb"));
    }
    public static int coutJewels(String a, String b){
        int count = 0;
        Set<Character> ch = new HashSet<>();
        if((a==null || b == null) && (a.length()==0 || b.length()==0))
            throw new NullPointerException("No Jewel to check for ");

        for (int i=0; i<a.length();i++){
            ch.add(a.charAt(i));
        }
        for (int i=0; i<b.length();i++){
            if(ch.contains(b.charAt(i)))
                count++;
        }
        return count;
    }
}
