package hr;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaabbbbc";
        compressGivenString(s);
    }
    public static void compressGivenString(String s){
        int start=0;
        int count = 0;

        if(s.equals(null))
            throw new NullPointerException("Null string");
        if(s.length() <= 0 )
            System.out.println(s);
        else{
            StringBuilder sb = new StringBuilder();
            for(int i =0; i<s.length(); i++){
                if(s.charAt(i) == s.charAt(start)){
                    count++;
                }else {
                    sb.append(s.charAt(i-1));
                    if(count>1)
                        sb.append(count);
                    count = 0;
                    start = i;
                }
            }
            System.out.println(sb.toString());
        }
    }
}
