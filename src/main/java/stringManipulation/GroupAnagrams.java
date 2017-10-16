package stringManipulation;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println();
    }
    public static List<List<String>> groupAanagrams(String[] s){
        HashMap<String,List> map = new HashMap<String, List>();
        for(String t: s){
            char[] a = t.toCharArray();
            Arrays.sort(a);
            String temp = String.valueOf(a);
            if(!map.containsKey(temp))
                map.put(temp,new ArrayList());
            map.get(temp).add(t);
        }
        return new ArrayList(map.values());
    }
}
