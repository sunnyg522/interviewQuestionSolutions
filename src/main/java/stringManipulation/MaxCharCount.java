package stringManipulation;

import java.util.HashMap;

/**
 * Created by dgunda on 9/24/17.
 */
public class MaxCharCount {
    public static void main(String[] args) {
        String testInput  = "tjdoj e ado a eo da joijdofaaaaa";
        System.out.println(maxCharCount(testInput));
    }
    public static char maxCharCount(String test){
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        for (int i = 0; i<test.length();i++){
            char currChar = test.charAt(i);
            if(!charCountMap.containsKey(currChar)){
                charCountMap.put(currChar,1);
            }else {
                charCountMap.put(currChar,charCountMap.get(currChar)+1);
            }
        }
        int maxCount = 0;
        int result=0;
        for (char r : charCountMap.keySet()){
            if(charCountMap.get(r) > maxCount){
                maxCount = charCountMap.get(r);
                result = r;
            }
        }
        return (char)result;
    }
}
