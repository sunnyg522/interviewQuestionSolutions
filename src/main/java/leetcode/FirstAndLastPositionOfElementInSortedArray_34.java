package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 11/30/18
 */
public class FirstAndLastPositionOfElementInSortedArray_34 {
    public static void main(String[] args) {
        int[] input = {5, 7, 7, 8, 8, 10};
        int [] range =searchRange(input,8);
        System.out.println(range[0]+" "+range[1]);
    }
    public static int extreemIndex(int[] input, int target, boolean left){
       int lo =0;
       int hi = input.length-1;
       while (lo<hi){
          int mid = (lo+hi)/2;
          if(input[mid] >target || left && target == input[mid]){
              hi = mid;
          }
          else
              lo = mid+1;
       }
       return lo;
    }
    public static int[] searchRange(int[] input, int target){
        int[] result  = {-1,-1};
        int leftIndex = extreemIndex(input,target,true);
        if( input[leftIndex]!= target || leftIndex == input.length)
           return result;
        result[0] = leftIndex;
        result[1] = extreemIndex(input,target,false)-1;
        return result;
    }
}
