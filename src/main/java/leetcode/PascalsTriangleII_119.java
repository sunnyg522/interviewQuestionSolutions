package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 2019-07-08
 */
public class PascalsTriangleII_119 {
    public static void main(String[] args) {

    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if (rowIndex < 0)
            return list;

        for(int i=0;i<rowIndex+1;i++){
            list.add(0, 1);
            for(int j=1;j<list.size()-1;j++){
                list.set(j,list.get(j) + list.get(j + 1));
            }
        }
        return list;
    }
}
