package leetcode.matrix;

/**
 * @project q
 * @authore dgunda on 2019-07-07
 */
public class WallsAndGates {
    public static void main(String[] args) {

    }
    public static void wallsAndGates(int[][] rooms){
        int row = rooms.length;
        int col = rooms[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(rooms[i][j]==0){
                    dfs(i, j, 0, rooms);
                }
            }
        }
    }
    public static void dfs(int i, int j, int count, int[][] rooms){
        int row = rooms.length;
        int col = rooms[0].length;
        if(i< row || i>=row || j<col|| j>=col|| rooms[i][j]<count){
            return;
        }
        rooms[i][j] = count;
        dfs(i+1, j, count+1, rooms);
        dfs(i-1, j, count+1, rooms);
        dfs(i, j+1, count+1, rooms);
        dfs(i, j-1, count+1, rooms);
    }
}
