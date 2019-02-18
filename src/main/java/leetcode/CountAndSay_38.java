package leetcode;

/**
 * @project q
 * @authore dgunda on 12/8/18
 */
public class CountAndSay_38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(3));
    }
    public static String countAndSay(int n) {
        if(n<=0)
            return null;
        int i = 1;
        String result  = "1";
        while (i<n){
            StringBuilder sb = new StringBuilder();
            int count=1;
            for(int j=0;j<result.length();j++){
                if(result.charAt(j) == result.charAt(j)){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(result.charAt(j - 1));
                    count =1;
                }
            }
            sb.append(count);
            sb.append(result.charAt(result.length() - 1));
            result = sb.toString();
            i++;
        }
        return result;
    }
}
