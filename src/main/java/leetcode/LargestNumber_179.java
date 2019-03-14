package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @project q
 * @authore dgunda on 3/5/19
 */
public class LargestNumber_179 {
    public static void main(String[] args) {
        //System.out.printf(largestNumber(new int[]{0,0}));
    }
    public static String largestNumber(int[] nums) {
        String str[] = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String s: str){
            sb.append(s);
        }
        while (sb.charAt(0) == '0' && sb.length() >1)
            sb.deleteCharAt(0);
        return sb.toString();
    }
}
