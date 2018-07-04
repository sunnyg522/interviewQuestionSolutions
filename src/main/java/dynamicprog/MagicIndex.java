package dynamicprog;

/**
 * The given index is a magic index if the index and the value at the index is same. The array is a sorted array
 * @project q
 * @authore dgunda on 6/27/18
 */
public class MagicIndex {
    public static void main(String[] args) {
        int[] input = {-40,-20,-1,1,2,3,5,7,9,12,13};
        magicNumber(input, 0, input.length-1);
    }
    public static void magicNumber(int[] input, int left, int right){
        if(right<left)
            return;
        int mid =  (left+right)/2;
        if(mid == input[mid])
            System.out.println(input[mid]);
        else {
            magicNumber(input, left, mid - 1);
            magicNumber(input, mid + 1, right);
        }
    }
}
