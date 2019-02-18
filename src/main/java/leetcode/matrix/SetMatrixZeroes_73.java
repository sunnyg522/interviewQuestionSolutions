package leetcode.matrix;

/**
 * @project q
 * @authore dgunda on 2/10/19
 */
public class SetMatrixZeroes_73 {
    public static void main(String[] args) {

    }
    public static void setZeroes(int[][] matrix) {
        boolean isCol = false;
        int R = matrix.length;
        int C = matrix[0].length;

        for (int i = 0; i < R; i++) {
            if (matrix[i][0] == 0) {
                isCol = true;
            }
            for (int j = 1; j < C; j++) {
                if (matrix[0][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i=1;i<R;i++){
            for(int j=1;j<R;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]= 0;
                }
            }
        }
        if(isCol){
            for (int i = 0; i < R; i++) {
                matrix[i][0] = 0;
            }
        }
        if(matrix[0][0] == 0){
            for (int j = 0; j < C; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
