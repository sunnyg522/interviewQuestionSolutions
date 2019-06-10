package leetcode;

import java.util.*;

/**
 * @project q
 * @authore dgunda on 2019-06-06
 */
public class KeyboardRow_500 {
    public static void main(String[] args) {
        System.out.println(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
    }
    public static String[] findWords(String[] words) {
        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            for(char c: strs[i].toCharArray()){
                map.put(c, i);
            }
        }
        List<String> res = new LinkedList<>();
        for(String w: words){
            if(w.equals(""))
                continue;
            int index = map.get(w.toUpperCase().charAt(0));
            for(char c: w.toUpperCase().toCharArray()){
                if(map.get(c) != index){
                    index = -1;
                    break;
                }
            }if(index!=-1){
                res.add(w);
            }
        }
        return res.toArray(new String[0]);
    }
}
