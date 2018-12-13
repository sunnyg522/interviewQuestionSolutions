package leetcode;

import java.util.*;

/**
 * @project q
 * @authore dgunda on 12/2/18
 */
public class GroupAnagrams_49 {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> out = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        int[] arry = new int[256];
        for(String s: strs){
            Arrays.fill(arry,0);
            for(int i=0;i<s.length();i++){
                arry[s.charAt(i)-'a']++;
            }
            StringBuilder hasValue = new StringBuilder();
            for(int i=0; i<arry.length;i++){
                hasValue.append(arry[i]);
                hasValue.append("#");
            }
            String hash = hasValue.toString();
            if(!map.containsKey(hash)){
                List<String> str = new ArrayList<>();
                str.add(s);
                map.put(hash,str);
            }else {
                List<String> temp = map.get(hash);
                temp.add(s);
                map.put(hash,temp);
            }
        }
        for(List<String> list: map.values()){
            out.add(list);
        }
        return out;
    }

}
