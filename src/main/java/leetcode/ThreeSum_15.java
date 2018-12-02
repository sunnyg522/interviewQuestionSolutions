package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 11/21/18
 */
public class ThreeSum_15 {
    public static void main(String[] args) {
        int[] input = {-1, 0, 1, 2, -1, -4};
        //System.out.println(threeSum(input));
        System.out.println(threeSumOptimized(input,0));

    }

    // using extra data structure and O(n*n)
    public static List<List<Integer>> threeSum(int[] a){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(map.containsKey(-(a[i]+a[j]))){
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(a[i]);
                    list1.add(a[j]);
                    list1.add(-(a[i]+a[j]));
                    list.add(list1);
                }else {
                    if(map.containsKey(a[i])){
                        int temp = map.get(a[i]);
                        map.put(a[i], temp++);
                    }else{
                        map.put(a[i], 1);
                    }
                }
            }
        }
        return list;
    }
    // without using extra DS
    public static List<List<Integer>> threeSumOptimized(int[] a, int sum){
        Arrays.sort(a);
        List<List<Integer>> lists = new ArrayList<>();
        int l=0, r=0;
        for(int i=0;i<a.length-2;i++){
            l=i;
            r=a.length-1;
            while (l<r){
                if(a[i]+a[l]+a[r] == sum)
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(a[i]);
                    list.add(a[l]);
                    list.add(a[r]);
                    lists.add(list);
                    l++;
                    r--;
                }else if (a[i] + a[l] + a[r] < sum)
                    l++;
                else
                    r--;
            }
        }
        return lists;
    }
}
