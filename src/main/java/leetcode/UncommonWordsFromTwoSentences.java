package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @project q
 * @authore dgunda on 2019-06-05
 */
public class UncommonWordsFromTwoSentences {
    public static void main(String[] args) {

    }
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: (A+" "+B).split(" ")){
            map.put(s, map.getOrDefault(s,0)+1);
        }

        ArrayList<String> arrayList = new ArrayList<>();
        for(String w: map.keySet()){
            if(map.get(w) == 1)
                arrayList.add(w);
        }
        return arrayList.toArray(new String[0]);
    }
}
