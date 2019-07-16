package leetcode.matrix;

/**
 * @project q
 * @authore dgunda on 2019-07-06
 */
public class MaxAreaOfIsland_695 {
    public static void main(String[] args) {
        System.out.println(maxAreaOfIsland(new int[][]{{0}}));
    }
    public static int maxAreaOfIsland(int[][] grid) {
        if(grid==null || grid.length==0||grid[0].length==0)
            return 0;
        int row = grid.length;
        int col = grid[0].length;
        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    int temp = dfs(grid, i, j);
                    maxArea = Math.max(maxArea, temp);
                }
            }
        }
        return maxArea;
    }
    public static int dfs(int[][] grid,int i, int j){
        int row = grid.length;
        int col = grid[0].length;
        if(i<0 || i>=row || j<0 || j>=col || grid[i][j]!=1)
            return 0;
        grid[i][j] = 9;
        return (1+ dfs(grid,i-1, j) + dfs(grid, i+1,j) + dfs(grid,i, j-1) + dfs(grid, i, j+1));
    }

}
