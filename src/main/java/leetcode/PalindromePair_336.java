package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @project q
 * @authore dgunda on 2019-07-05
 */
public class PalindromePair_336 {
    public static void main(String[] args) {
        System.out.println(palindromePairs(new String[]{"abcd","dcba","lls","s","sssll"}));
    }
    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        if(words == null || words.length<2){
            return result;
        }
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i], i);
        }
        for(int i=0;i<words.length;i++){
            String s = words[i];
            for(int k=0;k<=s.length();k++){
                String left = s.substring(0,k);
                String right = s.substring(k);
                if(isPalindrome(left)){
                    String revRight = new StringBuilder(right).reverse().toString();
                    if(map.containsKey(revRight)&&map.get(revRight)!=i){
                        List<Integer> l = new ArrayList<>();
                        l.add(map.get(revRight));
                        l.add(i);
                        result.add(l);
                    }
                }
                if(isPalindrome(right)){
                    String revLeft = new StringBuilder(left).reverse().toString();
                    if(map.containsKey(revLeft) && map.get(revLeft)!=i && right.length()!=0){
                        List<Integer> l = new ArrayList<>();
                        l.add(map.get(revLeft));
                        l.add(i);
                        result.add(l);
                    }
                }
            }
        }
        return result;
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;

        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
