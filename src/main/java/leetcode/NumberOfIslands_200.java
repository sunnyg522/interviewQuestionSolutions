package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-07-06
 */
public class NumberOfIslands_200 {
    public static void main(String[] args) {

    }
    public static int numIslands(char[][] grid) {
        if(grid==null || grid.length==0||grid[0].length==0)
            return 0;
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i, j);
                }
            }
        }
        return count;
    }
    public static void dfs(char[][] grid, int i, int j){
        int row = grid.length;
        int col = grid[0].length;

        if(i<0 || i>=row || j<0 || j>=col || grid[i][j]!=1){
            return;
        }
        grid[i][j] = 'X';
        dfs(grid, i-1,j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
}
