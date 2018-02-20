package hr;


import java.util.Arrays;
import java.util.HashMap;

public class AnagramofString {
    public static void main(String[] args) {
        String t1 = "cat";
        String t2 = "tac";
        System.out.println(isAnagramM1(t1,t2));
        System.out.println(isAnagramM2(t1,t2));
    }
    public static boolean isAnagramM1(String s1, String s2){
        //by sorting
        if(s1.length() != s2.length())
            return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2))
            return true;
        else
            return false;
    }

    public static boolean isAnagramM2(String s1, String s2){
        // Using aschi char array, this is the most effective sol. or hashmap can also be used .
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
