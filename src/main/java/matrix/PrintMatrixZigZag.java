package matrix;

public class PrintMatrixZigZag {
    public static void main(String[] args) {
        int r = 4, c = 5;
        int mat[][] = { {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        printMatrixZigZag(mat);
    }
    public static void printMatrixZigZag(int[][] matrix){
        int rows = matrix[1].length;
        int evenRow =0;
        int oddRow = 1;
        while (evenRow<rows && oddRow<rows){
                for(int i=0;i<matrix[evenRow].length;i++){
                    System.out.print(matrix[evenRow][i]+",");
                }
            System.out.println();
            evenRow = evenRow+2;
            for(int i=matrix[oddRow].length-1;i>=0;i--){
                System.out.print(matrix[oddRow][i]+",");
            }
            System.out.println();
            oddRow = oddRow+2;
        }
    }
}
