package leetcode;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 11/29/18
 */
public class Permutation_46 {
    public static void main(String[] args) {
        int[] data = {1,2,3};
        Integer[] newArray = new Integer[data.length];
        int i = 0;
        for (int value : data) {
            newArray[i++] = Integer.valueOf(value);
        }
     //   System.out.println(Arrays.toString(newArray));
        System.out.println(permute(newArray));
    }
    public static List<List<Integer>> permute(Integer[] in){
        List<List<Integer>> lists = new ArrayList<>();
        permute(in, 0, in.length,lists);
        return lists;
    }
    public static void permute (Integer[] in, int level, int r, List<List<Integer>> lists){
        if(level==r){
            List<Integer> list = Arrays.asList(in);
            //System.out.println(Arrays.toString(in));
            System.out.println(list);
            lists.add(Arrays.asList(in));
            return;
        }

        for(int i=0;i<r;i++){
            swap(in, level,i);
          //  System.out.println(Arrays.toString(in));
            permute(in,level+1,r,lists);
            swap(in,level,i);
         //   System.out.println(Arrays.toString(in));
        }
    }
    public static void swap(Integer[] list, int i, int j){
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
      //  System.out.println(Arrays.toString(list));
        //return list;
    }
}