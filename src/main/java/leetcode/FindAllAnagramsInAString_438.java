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
        System.out.println(getAnaGrameList("aa", "bb"));
    }
    public static List<Integer> getAnaGrameList(String a,String b){
        int diff = a.length()-b.length();
        int anLenght = b.length();
        for(int i =0;i<=diff;i++){
            System.out.println(a.substring(i, i+anLenght));
            if(isAnagram(a.substring(i,i+anLenght),b)) {
                System.out.println(isAnagram(a.substring(i,i+anLenght),b));
                list.add(i);
            }
        }
        return list;
    }
    public static boolean isAnagram(String s1, String s2){
        if(s1.length()!= s2.length())
            return false;
        int[] temp = new int[256];
        int i = 0;
        while (i < s1.length()){
            temp[s1.charAt(i)]++;
            temp[s2.charAt(i)]--;
            i++;
        }
        for(int t : temp){
            if(t!=0 )
                return false;
        }

        return true;
    }



}
