package leetcode.matrix;

/**
 * @project q
 * @authore dgunda on 2019-03-19
 */
public class ValidSudoku_36 {
    public static void main(String[] args) {
        char[][] input = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(input));
    }
    public static boolean isValidSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9)
            return false;
        // Check each row for value
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (row[(int) board[i][j] - '1'])
                        return false;
                    row[(int) board[i][j] - '1'] = true;
                }
            }
        }
        //Check each and every column
        for (int j = 0; j < 9; j++) {
            boolean[] row = new boolean[9];
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    if (row[(int) board[i][j] - '1'])
                        return false;
                    row[(int) board[i][j] - '1'] = true;
                }
            }
        }

        for(int block=0;block<9;block++){
            boolean[] m  = new boolean[9];
            for(int i=block/3*3;i<block/3*3+3;i++){
                for(int j=block%3*3;j<block%3*3+3;j++){
                    if(board[i][j]!='.') {
                        if (m[(int) board[i][j] - '1']) {
                            return false;
                        }
                        m[(int) board[i][j] - '1'] = true;
                    }
                }
            }
        }
        return true;

    }

}
