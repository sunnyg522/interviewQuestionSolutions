package leetcode.matrix;

/**
 * @project q
 * @authore dgunda on 2019-07-08
 */
public class LongestIncreasingPathInAMatrix_329 {
    public static void main(String[] args) {

    }
    public int longestIncreasingPath(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] max = new int[1];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                dfs(i, j, matrix, max, 0);
            }
        }
        return max[0];
    }
    public void dfs(int i, int j, int[][] matrix, int[] max, int len){
        max[0] = Math.max(max[0], len);

        int row = matrix.length;
        int col = matrix[0].length;

        int[] dx = {-1,0,1,0};
        int[] dy = {0,-1,0,1};
        for(int k= 0;k<4;k++){
            int x = i+dx[k];
            int y = j+dy[k];
            if(x>=0 && x<row && y>0 && y<col&&matrix[x][y]>matrix[i][j]){
                dfs(i, j, matrix, max, len+1);
            }
        }
    }
}
