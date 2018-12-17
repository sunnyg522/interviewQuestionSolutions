package leetcode.bitwise;

/**
 * @project q
 * @authore dgunda on 12/16/18
 */
public class CountNumberOfBitsToBeFlippedToConvertAToB {
    public static void main(String[] args) {
        System.out.println(countBitsToBeFlipped(10,20));
    }
    public static int countBitsToBeFlipped(int A, int B){
        int temp = A ^ B;
        int count = 0;
        while (temp>0){
            if((temp&1)>0)
                count++;
            temp >>= 1;
        }
        return count;
    }
}
