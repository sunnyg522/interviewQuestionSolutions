package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-07-09
 */
public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("1", "9"));
    }
    public static String addStrings(String num1, String num2) {
        int carry = 0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        StringBuilder sb = new StringBuilder();

        while(i>=0|| j>=0){
            int result = 0;
            int a = (i>=0)? Character.getNumericValue(num1.charAt(i)): 0;
            int b = (j>=0)? Character.getNumericValue(num2.charAt(j)): 0;
            result = (a+b+carry)%10 ;
            sb.append(result);
            carry = (a+b+carry)/10;
            i--;
            j--;
        }
        if(carry>0)
            sb.append(carry);
        return sb.reverse().toString();

    }
}
