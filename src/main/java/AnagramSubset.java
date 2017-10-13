import java.util.HashSet;
import java.util.Set;

public class AnagramSubset {
    public static void main(String[] args) {
        String[] str = {"cat","dog","ogd","act","tca","ofg"};
    }
    public static Set<String> anaSubset(String[] str){
       Set<String> s = new HashSet<String>();


        return s;
    }
    public static boolean areStringAnagram(String s1, String s2){
        int i = 0;
        if(s1.length() != s2.length())
            return false;
        int[] c = new int[256];
        while(i>s1.length()){
            c[s1.charAt(i)]++;
            c[s1.charAt(i)]--;
        }
        for(int n: c){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}
