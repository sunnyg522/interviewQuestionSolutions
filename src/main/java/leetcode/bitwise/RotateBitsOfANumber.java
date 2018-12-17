package leetcode.bitwise;

/**
 * @project q
 * @authore dgunda on 12/16/18
 */
public class RotateBitsOfANumber {
    public static int INT_BITS = 32;
    public static void main(String[] args) {
        System.out.println(leftRotation(16,2));
        System.out.println(rightRotation(16,2));
    }
    public static int leftRotation(int a, int rotationNumber){
        return (a<<rotationNumber) | (a>>(INT_BITS-rotationNumber));
    }
    public static int rightRotation(int a, int rotationNumber){
        return (a>>rotationNumber) | (a<<(INT_BITS-rotationNumber));
    }
}
