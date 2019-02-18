package leetcode;

/**
 * @project q
 * @authore dgunda on 2/17/19
 */
public class AddBinary_67 {
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }
    public static String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while(i>=0 || j>=0){
            int sum = 0;
            if(i>=0 && a.charAt(i) == '1')
                sum++;
            if(j>=0 && b.charAt(j) == '1')
                sum++;
            sum = sum+carry;
            if(sum >=2){
                carry = 1;
            }else{
                carry = 0;
            }
            sb.insert(0,  (char) ((sum%2) + '0'));
            i--;
            j--;
        }
        if(carry==1)
            sb.insert(0, '1');
        return  sb.toString();
    }
}
