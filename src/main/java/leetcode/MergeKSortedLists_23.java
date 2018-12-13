package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @project q
 * @authore dgunda on 11/25/18
 */
public class MergeKSortedLists_23 {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(merge(new int[]{1, 2, 6, 7, 8}, new int[] {3,4,5})));
        List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,4,5));
        List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(1,3,4));
        List<Integer> l3 = new ArrayList<Integer>(Arrays.asList(2,6));
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(l1);
        lists.add(l2);
        lists.add(l3);
        System.out.println(mergeKSortedList(lists));
        System.out.println(mergeKLists(lists));
    }
    public static List<Integer> merge2Lists( List<Integer> a, List<Integer> b){
        int i=0,j=0;
        int k = 0;
        List<Integer> auxList = new ArrayList<>();
        while(k<a.size()+b.size()){
            if(i>=a.size())
                auxList.add(k++, b.get(j++));
            else if(j>=b.size())
                auxList.add(k++, a.get(i++));
            else if(a.get(i)>b.get(j))
                auxList.add(k++, b.get(j++));
            else
                auxList.add(k++, a.get(i++));
        }
        return auxList;
    }
    public static List<Integer> mergeKSortedList(List<List<Integer>> lists){
        if (lists == null || lists.size() == 0) {
            return null;
        }
        return mergeKSortedList(lists, 0, lists.size() - 1);
    }

    public static List<Integer> mergeKSortedList(List<List<Integer>> inputList,int left, int right){
        if(left<right){
            int mid = left+(right-left)/2;
            return merge2Lists(mergeKSortedList(inputList, left, mid), mergeKSortedList(inputList, mid+1,right));
        }
        return inputList.get(left);
    }
    public static List<Integer> mergeKLists(List<List<Integer>> lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<lists.size();i++){
            List<Integer> list = lists.get(i);
            for (int j=0;j<list.size();j++){
                pq.add(list.get(j));
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i: pq){
            list.add(i);
        }
        return list;
    }
}
