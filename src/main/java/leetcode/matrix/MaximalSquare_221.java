package leetcode.matrix;

/**
 * @project q
 * @authore dgunda on 2019-07-07
 */
public class MaximalSquare_221 {
    public static void main(String[] args) {

    }
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        int result = 0;
        for (int i=0;i<row;i++){
            dp[i][0] = matrix[i][0]-'0';
            result = Math.max(result, dp[i][0]);
        }
        for(int j=0; j<col;j++){
            dp[0][j] = matrix[j][0]-'0';
            result = Math.max(result, dp[0][j]);
        }

        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                if(matrix[i][j] == '1'){
                    int min = Math.min(dp[i-1][j], dp[i][j-1]);
                    min = Math.min(min, dp[i-1][j-1]);
                    dp[i][j] = min+1;
                    result = Math.max(result, min+1);
                }
            }
        }
        return result;
    }
}
