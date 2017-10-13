public class StringCompression {
    public static void main(String[] args) {
        String testInput = "aaaabbbbbccccc";
        String testInput2 = "aaa";
        String testInput3 = "a";
        String testInput4  = "abcdddd";
        String testNull=null;
        System.out.println(compressString(testInput));
        System.out.println(compressString(testInput2));
        System.out.println(compressString(testInput3));
        System.out.println(compressString(testInput4));
        System.out.println(compressString(testNull));
    }
    public static String compressString(String s){
        StringBuilder sb = new StringBuilder();
        if(s.equals(null))
            throw new NullPointerException("The input String is null");
        if(s.length()<2){
            return s;
        }else{
            int next=1;
            int count=0;
            while (next !=s.length()){
                if(s.charAt(next-1) == s.charAt(next)){
                    next++;
                    count++;
                }else {
                    if(count != 0){
                        sb.append(s.charAt(next-1));
                        sb.append(count+1);
                    }else{
                        sb.append(s.charAt(next-1));
                    }
                    next++;
                    count=0;
                }
            }
            sb.append(s.charAt(next-1));
            sb.append(count+1);
        }
        return (s.length()<sb.toString().length())?s:sb.toString();
    }
}
