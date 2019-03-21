package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @project q
 * @authore dgunda on 2019-03-18
 */
public class IntersectionOfTwoArrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums1){
            set.add(num);
        }
        List<Integer> list = new ArrayList<>();
        for(int num: nums2){
            if(set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }
        int[] in = new int[list.size()];
        for(int i=0;i<list.size();i++){
            in[i] = list.get(i);
        }
        return in;
    }

    public static void main(String[] args) {

    }
}
