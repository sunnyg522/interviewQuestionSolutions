package leetcode;

/**
 * @project q
 * @authore dgunda on 12/7/18
 */
public class NumberOf1Bits_191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(5));
        System.out.println(Integer.toBinaryString(5));
    }
    public static int hammingWeight(int n) {
        int count=0;
        int mask = 1;
        for(int i=0;i<32;i++){
            if((n&mask)!=0)
                count++;
            mask = mask<<1;
            System.out.println(Integer.toBinaryString(mask));
        }
        return count;
    }
}
