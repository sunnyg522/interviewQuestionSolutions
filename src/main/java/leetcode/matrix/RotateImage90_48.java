package leetcode.matrix;

/**
 * @project q
 * @authore dgunda on 2019-03-18
 */
public class RotateImage90_48 {
    public static void main(String[] args) {

    }
    public static void rotate90(int[][] matrix){
        //transpose of matrix
        int m = matrix.length;
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

         //reverse the matrix.
//        for(int i=0;i<m;i++){
//            for(int j=0;j<)
//        }
    }
}
