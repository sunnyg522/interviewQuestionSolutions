package leetcode.bitwise;

/**
 * @project q
 * @authore dgunda on 12/16/18
 */
public class EfficientWayToMultiplyWith7 {
    public static void main(String[] args) {
        System.out.println(multiply7(4));
    }
    public static int multiply7(int a){
        return (a<<3) - a;
    }
}
