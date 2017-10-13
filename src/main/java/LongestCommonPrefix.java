public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] testInput = {"leetCode","lee","leetest","leemest"};
        System.out.printf(getLongestComPrefix(testInput));
    }
    public static String getLongestComPrefix(String[] str){
        String prefix = str[0];
        for(int i= 0; i<str.length;i++){
            while (str[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.equals("")){
                    return "";
                }
            }
        }
        return prefix;
    }
}
