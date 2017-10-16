package matrix;

public class Searcha2DMatrix {
    public static void main(String[] args) {
        int[][] testInput ={
                {1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        System.out.println(matSearch(testInput,40));
    }
    public static boolean matSearch(int[][] mat, int searchValue){
        if(mat.length==0 || mat[0].length==0)return false;
        int M = mat[0].length;
        int N = mat.length;
        int left = 0;
        int right = M*N-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            int row = mid /M;
            int col = mid %M;
            if(mat[row][col] == searchValue)
                return true;
            else if(searchValue < mat[row][col])
                right = mid-1;
            else
                left = mid + 1;
        }
        return false;
    }
}
