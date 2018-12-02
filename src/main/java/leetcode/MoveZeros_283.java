package leetcode;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 11/14/18
 */
public class MoveZeros_283 {
    public static void main(String[] args) {
        int[] input = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println(Arrays.toString(moveZeros(input)));

    }
    public static int[] moveZeros(int[] input){
        int count = 0;
        for(int i=0; i<input.length;i++){
            if(input[i] != 0)
                input[count++] = input[i];
        }
        while (count<input.length){
            input[count] = 0;
            count++;
        }
        return input;
    }
}
