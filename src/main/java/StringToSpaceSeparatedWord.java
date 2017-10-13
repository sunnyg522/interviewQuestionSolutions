import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringToSpaceSeparatedWord {
    public static void main(String[] args) {
        String test = "bedbathandbeyond";
        System.out.println(splitWordWithSpace(test));
    }
    public static String splitWordWithSpace(String s){
        StringBuilder sb = new StringBuilder();
        Set<String> dict = new HashSet<String>(Arrays.asList("bed","bath","and","beyond"));
        int maxWordLength =0;

        for(String t: dict){
            maxWordLength = t.length()>maxWordLength ? t.length():maxWordLength;
        }

        int i = 0;
        int j = 0;
        if(s.equals(null))
            throw new IllegalArgumentException("String cannot be null");
        while(i<s.length()){
            String tempWord = s.substring(j,i);
            if(dict.contains(tempWord)){
                if(i-j >maxWordLength) {
                    throw new IllegalArgumentException("No word found in dict");
                }else {
                    sb.append(tempWord);
                    sb.append(" ");
                    j = i;
                }
            }else{
                i++;
            }
        }
        sb.append(s.substring(j,i));
        return sb.toString();

    }
}
