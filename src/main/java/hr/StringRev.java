package hr;

public class StringRev {
    public static void main(String[] args) {
        String t = "pappu";
        revString(t);
    }
    public static void revString(String s){
        if(s.equals(null))
            throw new NullPointerException("empty String");

        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i>=0;i--){
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
