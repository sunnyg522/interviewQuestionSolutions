package leetcode.matrix;

/**
 * @project q
 * @authore dgunda on 2/13/19
 */
public class SpiralMatrix_II_59 {
    public static void main(String[] args) {

    }
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int k =1;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;

        while (k<n*n){
            for(int i=left;i<=right;i++){
                result[top][i] = k;
                k++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result[i][right] = k;
                k++;
            }
            right--;
            for (int i=right;i>=left;i++){

            }
        }
        return result;

    }
}
