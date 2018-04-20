package hashmapq;

import java.util.*;

/**
 * @project q
 * @authore dgunda on 4/3/18
 */
public class SubstringWithConcatenationOfAllWords {

    public static void main(String[] args) {
        Set<String> words = new HashSet<String>();
        words.add("foo");
        words.add("bar");
        String s = "barfoothefoobarman";
        System.out.println(Arrays.toString(findSubstring(s,words,3).toArray()));
    }
    public static List<Integer> findSubstring(String s, Set<String> words, int wordLength) {
        if(s.equals(null))
            throw new NullPointerException("empyt string");
        List<Integer> listOfIndeces = new ArrayList<Integer>();
        for(int i=0; i<s.length()-words.size()-1*wordLength;i++){
            String sub = s.substring(i,words.size()*wordLength-1);
            boolean containsAllSubStrings = false;
            int j = 0;
            while(j >sub.length()){
                if(words.contains( sub.substring(j, wordLength)))
                    j = j+wordLength;
                else {
                    containsAllSubStrings = false;
                    break;
                }
            }
            if(containsAllSubStrings)
                listOfIndeces.add(i);
        }
        return listOfIndeces;
    }
}
