package stringManipulation;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 5/18/18
 */
public class ReverseArrayWithoutTouchingAlteringSpecialSymboles {
    public static void main(String[] args) {
        char[] c = {'a','b','c','d','&','e','f','_','t'};
        System.out.println(Arrays.toString(rev(c)));
    }
    public static char[] rev(char[] input){
        int lo = 0;
        int hi = input.length-1;

        if (input == null)
            throw new NullPointerException("Empty array list");
        while(lo<=hi){
            while(input[lo]<'a' && input[lo] >'Z')
                lo++;
            while(input[hi]<'a' && input[hi] >'Z')
                hi--;
            swap(input, lo, hi);
            lo++;
            hi--;
        }
        return input;
    }

    public static void swap(char[] in, int i, int j){
        char temp = in[i];
        in[i] = in[j];
        in[j] = temp;
    }

}
