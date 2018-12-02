package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 11/14/18
 */
public class FindAllNumbersDisappearedInAnArray_448 {
    public static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] n = {4,3,2,7,8,2,3,1};
        System.out.println(missingNumber(n));
    }
    public static List<Integer> missingNumber(int[] input){
        for(int i=0;i<input.length;i++){
            int val = Math.abs(input[i])-1;
            if(input[val]>0){
                input[val] = -input[val];
            }
        }
        for(int i=0;i<input.length;i++){
            if(input[i]>0)
                list.add(i+1);
        }
        return list;
    }
}
