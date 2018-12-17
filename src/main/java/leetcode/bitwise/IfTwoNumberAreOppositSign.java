package leetcode.bitwise;

/**
 * @project q
 * @authore dgunda on 12/16/18
 */
public class IfTwoNumberAreOppositSign {
    public static void main(String[] args) {
        System.out.println(oppositSign(100,100));
    }
    public static  boolean oppositSign(int x, int y){
        if((x^y) <0)
            return true;
        else return false;
    }
}
