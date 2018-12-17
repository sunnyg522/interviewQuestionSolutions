package leetcode.bitwise;

/**
 * @project q
 * @authore dgunda on 12/16/18
 */
public class MultiplyNumbe3AndHalf {
    public static void main(String[] args) {
        System.out.println(multipleWith3andHalf(2));
    }
    public static int multipleWith3andHalf(int x){
        return (x<<1) + x + (x>>1);
    }
}
