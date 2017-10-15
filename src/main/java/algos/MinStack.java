package algos;

import java.util.Stack;

public class MinStack {
    static class  Min{
        int curr;
        int minValue;
    }
    public static void main(String[] args) {
        int[] test = {6,4,2,5};
        System.out.println(getMinValue(test));
    }

    public static int getMinValue(int[] n){
        Stack<Min> s = new Stack<Min>();
        int min = Integer.MAX_VALUE;
        for (int t: n){
            if(t<min){
                Min m = new Min();
                min = t;
                m.curr = t;
                m.minValue = min;
                s.push(m);
            }else {
                Min m = new Min();
                m.curr = t;
                m.minValue = min;
                s.push(m);
            }
        }
        return s.pop().minValue;
    }
}
