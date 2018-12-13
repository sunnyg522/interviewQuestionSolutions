package leetcode;

import java.util.*;

/**
 * @project q
 * @authore dgunda on 12/3/18
 */
public class MergeIntervals_56 {
    public static class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
    }
    private static class IntervalComparator implements Comparator<Interval>{
        @Override
        public int compare(Interval a, Interval b) {
            return a.start<b.start? -1 : a.start==b.start?0:1;
        }
    }
    public static void main(String[] args) {

        Interval in1 = new Interval(1,3);
        Interval in2 = new Interval(2,6);
        Interval in3 = new Interval(8,10);
        Interval in4 = new Interval(15,18);
        List<Interval> intervals = new ArrayList<>();
        intervals.add(in1);
        intervals.add(in2);
        intervals.add(in3);
        intervals.add(in4);
        System.out.println(merge(intervals));

    }
    public static List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new IntervalComparator());

        List<Interval> mergeList = new ArrayList<>();
        for(Interval interval: intervals){
            if(mergeList.isEmpty() || mergeList.get(mergeList.size()-1).end < interval.start){
                mergeList.add(interval);
            }else{
                mergeList.get(mergeList.size()-1).end = Math.max(mergeList.get(mergeList.size()-1).end,interval.end);
            }
        }
        return mergeList;
    }
}
