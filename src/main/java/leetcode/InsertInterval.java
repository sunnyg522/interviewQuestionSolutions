package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 2/3/19
 */
public class InsertInterval {
    public static class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }

        @Override
        public String toString() {
            return "[" +
                    "" + start +
                    "," + end +
                    ']';
        }
    }
    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        //[1,3],[6,9], [2,5]
        ArrayList<Interval> result = new ArrayList<>();
        for(Interval i: intervals){
            if(i.end <newInterval.start){
                result.add(i);
            }else if(i.start>newInterval.end){
                result.add(newInterval);
                newInterval = i;
            }else if(i.end >= newInterval.start || i.start<= newInterval.end){
                newInterval = new Interval(Math.min(i.start,newInterval.start), Math.max(i.end,newInterval.end));
            }
        }
        result.add(newInterval);
        return result;
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Interval(1,3));
        list.add(new Interval(6,9));
        List l = insert(list, new Interval(2,5));
        System.out.println(l.toString());
    }
}
