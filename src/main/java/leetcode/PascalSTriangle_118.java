package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 2019-03-05
 */
public class PascalSTriangle_118 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows<0)
           return result;
        ArrayList<Integer> pre = new ArrayList<>();
        pre.add(1);
        result.add(pre);
        for(int i=2;i<=numRows;i++){
            ArrayList<Integer> current = new ArrayList<>();
            current.add(1);
                for (int j = 0; i<pre.size()-1;j++) current.add(pre.get(j) + pre.get(j + 1));
            current.add(1);
            result.add(current);
            pre =current;
        }
        return result;
    }
}
