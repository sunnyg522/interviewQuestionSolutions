package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 2019-05-13
 */
public class FindCommonCharacters_1002 {
    public static void main(String[] args) {

    }

    public List<String> commonChars(String[] A) {
        int[] dict = new int[26];
        List<String> out = new ArrayList<>();
        for(int i=0;i<A[0].length();i++){
            char c = A[0].charAt(i);
            dict[c-'a']++;
        }
        for(int i=1;i<A.length;i++){
            int[] curr = new int[26];
            for(int j= 0;j<A[i].length();j++){
                char c = A[i].charAt(j);
                curr[c-'a']++;
            }
            for(int j=0;j<26;j++){
                if(curr[j]<dict[j])
                    dict[j] = curr[j];
            }
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<dict[i];j++){
                out.add(Character.toString((char)('a'+i)));
            }
        }
        return out;
    }
}
