package leetcode;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 12/2/18
 */
public class RotateImage_48 {
    public static void main(String[] args) {
        int[][] input = {
                {5, 1, 9,11},
                {2, 4, 8,10},
                {13, 3, 6, 7},
                {15,14,12,16}
        };
        System.out.println(Arrays.deepToString(input));
        System.out.println(Arrays.deepToString(rotateImage(input)));
    }
    public static int[][] rotateImage(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
        return matrix;
    }
}
