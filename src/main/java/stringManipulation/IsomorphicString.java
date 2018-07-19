package stringManipulation;

import java.util.HashMap;

/**
 * @project q
 * @authore dgunda on 7/18/18
 */
public class IsomorphicString {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("abb", "foo"));
    }
    public static boolean isIsomorphic(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        HashMap<Character, Character> map = new HashMap<>();
        for (int i=0; i<s1.length();i++){
            char x = s1.charAt(i);
            char y = s2.charAt(i);
            if(map.containsKey(x)) {
                if (map.get(x) != y)
                    return false;
            }
            else {
                if(map.containsValue(y))
                    return false;
                map.put(x,y);
            }

        }
        return true;
    }
}
