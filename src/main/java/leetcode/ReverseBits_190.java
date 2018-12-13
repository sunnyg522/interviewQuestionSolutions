package leetcode;

/**
 * @project q
 * @authore dgunda on 12/7/18
 */
public class ReverseBits_190 {
    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }
    public static int reverseBits(int n) {
        int m = 0;
        for (int i = 0; i < 32; i++) {
            m = (m << 1) | (n & 1);
            n = n >> 1;
        }
        return m;
    }
}
