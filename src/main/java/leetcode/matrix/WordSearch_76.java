package leetcode.matrix;

/**
 * @project q
 * @authore dgunda on 2019-07-07
 */
public class WordSearch_76 {
    public static void main(String[] args) {

    }
    public static boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean result = false;
        for (int i = 0; i<row;i++){
            for(int j= 0;j<col;j++){
                if(dfs(i, j, board, 0, word))
                    result = true;
            }
        }
        return result;
    }
    public static boolean dfs(int i, int j, char[][] board, int k, String word){
        int row  = board.length;
        int col = board[0].length;
        if(i<0||i>=row|| j<0||j>=col)
            return false;
        if(board[i][j] == word.charAt(i)){
            char temp = board[i][j];
            board[i][j] = '#';
            if(k== word.length()-1) {
                return true;
            }
            else if (dfs(i+1, j, board, k+1, word)||
            dfs(i-1, j, board, k+1, word)||
            dfs(i, j+1, board, k+1, word)||
            dfs(i, j-1, board, k+1, word))
            {
                return true;
            }
            board[i][j] = temp;
        }
        return false;
    }
}
