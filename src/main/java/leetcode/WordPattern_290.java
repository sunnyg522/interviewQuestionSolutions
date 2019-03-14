package leetcode;

import java.util.HashMap;

/**
 * @project q
 * @authore dgunda on 2019-03-13
 */
public class WordPattern_290 {
    public static boolean wordPattern(String pattern, String str) {
        if(pattern.length() != str.split(" ").length)
            return false;
        HashMap<Character, String> map = new HashMap<>();
        String[] listOfString = str.split(" ");
        for(int i=0;i<pattern.length();i++){
            char curr = pattern.charAt(i);
            if(map.containsKey(curr)){
                String value = map.get(curr);
                if(!value.equals(listOfString[i]))
                    return false;
            }else if (map.containsValue(listOfString[i])){
                return false;
            }
            map.put(curr, listOfString[i]);
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
