package leetcode;

/**
 * @project q
 * @authore dgunda on 2/17/19
 */
public class StringToInteger_8 {
    public static void main(String[] args) {
        System.out.println(myAtoi("  0000000000012345678"));
    }
    public static int myAtoi(String str) {
        if(str.length() <1 || str == null){
            return 0;
        }
        str = str.trim();
        System.out.println(str);

        char flag = '+';
        int i = 0;
        if(str.charAt(0) == '-'){
            flag = '-';
            i++;
        }else if(str.charAt(0) == '+'){
            i++;
        }
        double result = 0;

        while (str.length() > i && str.charAt(i) >='0' && str.charAt(i)<='9'){
            result = result*10 + (str.charAt(i) - '0');
            i++;
        }
        if(flag == '-')
            result = -result;
        if(result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) result;
    }
}
