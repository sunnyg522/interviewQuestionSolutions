package hr;

import java.util.HashMap;

public class UniqWordsInString {
    public static void main(String[] args) {
        String test = "hello worlds test hello";
        printUniqueWordsInString(test);
    }
    public static void printUniqueWordsInString(String s){
        if(s.equals(null))
            throw new NullPointerException("no words in array");
        String[] wordArray = s.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String t: wordArray){
            if(!map.containsKey(t))
                map.put(t,1);
            else {
                int temp = map.get(t);
                map.put(t, ++temp);
            }
        }
        for(String t: map.keySet()){
            if(map.get(t)<=1)
                System.out.println(t+":"+ map.get(t));
        }
    }
}
