package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 11/25/18
 */
public class LetterCombinationsOfAPhoneNumber_17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    public static String getLetter(char digit){
        if (digit == '1') return "";
        if (digit == '2') return "abc";
        if (digit == '3') return "def";
        if (digit == '4') return "ghi";
        if (digit == '5') return "jkl";
        if (digit == '6') return "mno";
        if (digit == '7') return "pqrs";
        if (digit == '8') return "tuv";
        if (digit == '9') return "wxyz";
        return "";
    }
    public static List<String> letterCombinations(String digits) {
        List<String> items = new ArrayList<>();
        for(int i=0; i<digits.length(); i++){
            items.add(getLetter(digits.charAt(i)));
        }
        List<String> returnList  = new ArrayList<>();
        combinationUtil(items,0,"", returnList);
        return  returnList;

    }
   public static void combinationUtil(List<String> item , int i, String pre, List<String> returnElements){
        if(i == item.size()){
            returnElements.add(pre);
        }else {
        for(int j=0; j<item.get(i).length();j++){
            char c = item.get(i).charAt(j);
            combinationUtil(item, i+1, pre+c,returnElements);
        }
        }
   }
}
