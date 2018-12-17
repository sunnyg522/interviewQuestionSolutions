package leetcode.bitwise;

/**
 * @project q
 * @authore dgunda on 12/16/18
 */
public class BinaryRepresentationOfAGivenNumber {
    public static void main(String[] args) {
        bin(4);
        System.out.println();
        bin(131);
        System.out.println();
        bin(3);
    }
    public static void bin(int n){
        if(n>1)
            bin(n>>1);
        System.out.print(n&1);
    }
}
