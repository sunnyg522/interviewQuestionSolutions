package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 2019-07-09
 */
public class FindKClosestElements_658 {
    public static void main(String[] args) {

    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0;
        int r = arr.length-1;
        while(r-l>=k){
            if(Math.abs(arr[l]-x)>Math.abs(arr[r]-x)){
                l++;
            }else
                r--;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = l;i<=r;i++){
            list.add(arr[i]);
        }
        return list;
    }
}
