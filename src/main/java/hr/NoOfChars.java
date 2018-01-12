package hr;

public class NoOfChars {
    public static void main(String[] args) {
        String test = "daaaddsdsa";
        countNoOfChar(test);
    }
    public static void countNoOfChar(String s){
        if(s.equals(null))
            throw new NullPointerException("length of string is null");
        int[] c = new int[256];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)]++;
            //System.out.println(c[s.charAt(i)]);
        }
        for(int i = 0; i<s.length();i++){
            if(c[i]>=0) {
                System.out.println((char)i+ "" +c[i]);
            }
        }
    }
}
