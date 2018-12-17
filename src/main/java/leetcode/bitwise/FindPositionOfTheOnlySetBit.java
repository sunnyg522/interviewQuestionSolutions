package leetcode.bitwise;

/**
 * @project q
 * @authore dgunda on 12/16/18
 */
public class FindPositionOfTheOnlySetBit {
    public static void main(String[] args) {
        System.out.println(position(128));
    }
    public static int position(int n){
        int i=1;
        while (n>0){
            if((n&1)>0)
                return i;
            n>>=1;
            i++;
        }
        return 0;
    }
}
