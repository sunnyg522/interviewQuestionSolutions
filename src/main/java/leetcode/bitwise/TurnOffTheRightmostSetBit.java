package leetcode.bitwise;

/**
 * @project q
 * @authore dgunda on 12/16/18
 */
public class TurnOffTheRightmostSetBit {
    public static void main(String[] args) {
        System.out.println(turnOffRightMostBit(7));
    }
    public static int turnOffRightMostBit(int n){
        return n & (n-1);
    }
}
