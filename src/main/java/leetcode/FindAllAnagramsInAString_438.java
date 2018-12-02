package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 11/14/18
 */
public class FindAllAnagramsInAString_438 {
    public static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(getAnaGrameList("abab", "ab"));
    }
    public static List<Integer> getAnaGrameList(String a,String b){
        int diff = a.length()-b.length();
        int anLenght = b.length();
        for(int i =0;i<=diff;i++){
            if(isAnagram(a.substring(i,i+anLenght),b))
                list.add(i);
        }
        return list;
    }
    public static boolean isAnagram(String a, String b){
        if(a.length() != b.length())
            return false;
        int out = 0;
        for(int i=0;i<a.length();i++){
            out = out ^ (a.charAt(i)^b.charAt(i));
        }
        return out==0?true: false;
    }

}
