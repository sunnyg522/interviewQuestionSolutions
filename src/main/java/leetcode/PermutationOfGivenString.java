package leetcode;

import java.util.*;

/**
 * @project q
 * @authore dgunda on 11/24/18
 */
public class PermutationOfGivenString {
    public static void main(String[] args) {
        //System.out.println(permute("AABC").toString());
        System.out.println(permuterOpt("AABC"));
    }
    public static List<String> permute(String s){
        Map<Character, Integer> countMap  = new TreeMap<>();
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(countMap.containsKey(temp)){
                int currentVal = countMap.get(temp);
                countMap.put(temp, ++currentVal);
            }else
                countMap.put(temp, 1);
        }

        char str[] = new char[countMap.size()];
        int count[] = new int[countMap.size()];
        int index = 0;
        for(Map.Entry<Character, Integer> map : countMap.entrySet()){
            str[index] = map.getKey();
            count[index] = map.getValue();
            index++;
        }
        System.out.println(Arrays.toString(count));
        List<String> resultList = new ArrayList<>();
        char[] result = new char[s.length()];
        permuteUtil(str, count,result,resultList,0);
        return resultList;

    }
    public static void permuteUtil(char[] str, int[] count, char[] result, List<String> resultList, int level){
        if(level==result.length){
            resultList.add(Arrays.toString(result));
            return;
        }

        for(int i=0; i<str.length; i++){
            if(count[i] == 0){
                continue;
            }
            result[level] = str[i];
            count[i]--;
            permuteUtil(str, count, result, resultList, level+1);
            count[i]++;
        }

    }
    public static Set<String> permuterOpt(String s){
        Set<String> set = new HashSet<>();
        permuterOptUtil(s.toCharArray(), 0, s.length()-1, set);
        return set;
    }
    public static void permuterOptUtil(char[] s, int l, int r, Set<String> set){
        if(l==r){
            set.add(Arrays.toString(s));
            return;
        }
        for(int i=l;i<=r;i++){
            s = swap(s, l, i);
            permuterOptUtil(s, l+1, r, set);
            s = swap(s, i, l);
        }

    }
    public static char[] swap(char[] s, int a, int b){
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
        return s;
    }

}
