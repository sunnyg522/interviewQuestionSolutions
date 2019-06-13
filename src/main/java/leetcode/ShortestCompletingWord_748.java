package leetcode;

import java.util.*;

/**
 * @project q
 * @authore dgunda on 2019-06-11
 */
public class ShortestCompletingWord_748 {
    public static void main(String[] args) {
        System.out.println(shortestCompletingWord("GrC8950", new String[]{"measure","other","every","base","according","level","meeting","none","marriage","rest"}));
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> lpmap = new HashMap<>();
        for(char c: licensePlate.toCharArray()){
            c = Character.toLowerCase(c);
            if(Character.isLetter(c) && lpmap.containsKey(c)){
                int t = lpmap.get(c);
                lpmap.put(c, ++t);
            }else if(Character.isLetter(c))
                lpmap.put(c, 1);
        }
        System.out.println(Arrays.asList(lpmap));
        List<String> result = new ArrayList<>();
        for(String word: words){
            if(matches(lpmap, word))
                result.add(word);
        }
        if(result.size() == 0)
            return null;
        String minWord = result.get(0);
        for(String word: result){
            if(minWord.length()>word.length()){
                minWord = word;
            }
        }
        return minWord;
    }
    public static boolean matches(Map<Character, Integer> lpmap, String word){

        Map<Character, Integer> wordMap = new HashMap<>();
        for(char c: word.toCharArray()){
            c = Character.toLowerCase(c);
            if(wordMap.containsKey(c)){
                int t = wordMap.get(c);
                t = t+1;
                wordMap.put(c, t);
            }else
                wordMap.put(c, 1);
        }
        System.out.println(Arrays.asList(wordMap));
        for(char c: lpmap.keySet()){
            if(!(wordMap.containsKey(c) && (lpmap.get(c) <= wordMap.get(c)))){
                return false;
            }else if( !wordMap.containsKey(c)){
                return false;
            }
        }
        return true;
    }
}
