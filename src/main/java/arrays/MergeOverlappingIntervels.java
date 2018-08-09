package arrays;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 * Input: [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * @project q
 * @authore dgunda on 7/19/18
 */
public class MergeOverlappingIntervels {
    static class Interval{
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "[" + start +
                    "," + end +
                    "]";
        }
    }
    public static void main(String[] args) {
        Interval interval = new Interval(1,3);
        Interval interval1 = new Interval(2,6);
        Interval interval2 = new Interval(8,10);
        Interval interval3 = new Interval(15,18);
        List<Interval> intervalList = new ArrayList<Interval>();
        intervalList.add(interval);
        intervalList.add(interval1);
        intervalList.add(interval2);
        intervalList.add(interval3);
        Collections.sort(intervalList, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start!=o2.start)
                    return o1.start-o2.start;
                else
                    return o1.end-o2.end;
            }
        });
        for (Interval in: mergeInterval(intervalList)) {
            System.out.println(in.toString());
        }
    }
    public static List<Interval> mergeInterval(List<Interval> list){
        List<Interval> result = new ArrayList<Interval>();
        if(list==null||list.size()==0)
            return result;

        Interval prv = list.get(0);
        for (int i=0;i<list.size();i++){
            Interval cur = list.get(i);
            if(cur.start>prv.end) {
                result.add(prv);
                prv = cur;
            }else {
                Interval merged = new Interval(prv.start, Math.max(prv.end, cur.end));
                prv = merged;
            }
        }
        return result;
    }
}
