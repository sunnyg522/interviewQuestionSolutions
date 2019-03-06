package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @project q
 * @authore dgunda on 2/19/19
 */
public class RepeatedDNASequences {
    public static void main(String[] args) {
        System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }
    public static List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        for(int i=0;i+9<s.length();i++){
            String res = s.substring(i,i+10);
            if(!seen.add(res))
                repeated.add(res);
        }
        return  new ArrayList<>(repeated);
    }
}
