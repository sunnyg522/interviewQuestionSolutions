package leetcode.bitwise;

/**
 * @project q
 * @authore dgunda on 12/16/18
 */
public class CountNumberOFSetBits {
    public static void main(String[] args) {
        System.out.println(countNumberOfSetBits(5));
    }
    public static int countNumberOfSetBits(int n){
        int count = 0;
        while (n > 0){
            if((n&1)>0)
                count++;
            n >>=1;
        }
        return count;
    }
}
