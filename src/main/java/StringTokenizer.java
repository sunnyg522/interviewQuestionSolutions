import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringTokenizer {
    public static void main(String[] args) {
        String s1 = "leet code code";
        String s2 = "code";
        System.out.println(tokenizeString(s1,s2));
        System.out.println(stringTokenizer(s1,s2));
    }
    public static String tokenizeString(String s1, String s2){
        Set<String> tokenString = new HashSet<String>(Arrays.asList(s2.split(" ")));
        String[] temp = s1.split(" ");
        for(int i =0;i<temp.length;i++){
            if(tokenString.contains(temp[i])){
                tokenString.remove(temp[i]);
                temp[i]="";
            }
        }
        return Arrays.toString(temp);
    }

    public static String stringTokenizer(String s1, String s2){
        Set<String> tokenString = new HashSet<String>(Arrays.asList(s2.split(" ")));
        int i = 0;
        int j = 0 ;

        StringBuilder sb = new StringBuilder();
        while(i<s1.length()){
            String temp = s1.substring(j,i);
            if(tokenString.contains(temp)){
                tokenString.remove(temp);
                sb.append("");
                j=i;
            }else if(s1.charAt(i)==' '){
                i++;
                sb.append(s1.substring(j,i));
                j=i;
            } else {
                i++;
            }
        }
        sb.append(s1.substring(j,i));
        return sb.toString();
    }
}
