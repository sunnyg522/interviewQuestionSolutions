package leetcode.matrix;

import java.util.LinkedList;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 2/10/19
 */
public class SpiralMatrix_54 {
    public static void main(String[] args) {
        int[][] t = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(spiralOrder(t).toString());
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int x = 0;
        int y = 0;

        LinkedList<Integer> result = new LinkedList<>();
        while (m>0 && n>0){
            if(m==1){
                for(int i=0;i<n;i++){
                    result.add(matrix[x][y++]);
                }
            }else if(n==1){
                for(int i=0;i<m;i++){
                        result.add(matrix[x++][y]);
                }
            }
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y++]);
            }
            for(int j=0;j<m-1;j++){
                result.add(matrix[x++][y]);
            }
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y--]);
            }
            for(int j=0;j<m-1;j++){
                result.add(matrix[x--][y]);
            }
            x++;
            y++;
            m = m-2;
            n = n-2;
        }
        return result;
    }
}
