public class WordRevInSentense {
    public static void main(String[] args) {
        String test = "the sky is blue";
        System.out.println(wordRev(test));
    }
    public static String wordRev(String w){
        if(w.equals(null))
            throw new NullPointerException("String cannot be null");
        int i=w.length()-1;
        int j=w.length()-1;
        StringBuilder sb = new StringBuilder();
        while (i>=0){
            if(w.charAt(i)==' '){
                sb.append(w.substring(i+1,j+1));
                sb.append(w.charAt(i));
                i--;
                j=i;
            }else{
                i--;
            }
        }
        sb.append(w.substring(i+1,j+1));
        return sb.toString();
    }
}
