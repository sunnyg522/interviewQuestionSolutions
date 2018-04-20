package recursion;

/**
 * @project q
 * @authore dgunda on 4/3/18
 */
public class Pattern {
    public static void main(String[] args) {
        patt(4);
    }
    public static void patt(int n) {
        patt(n, n);
    }

    /**
     * using single recurssion
     * @param n
     * @param col
     */
    public static void patt(int n, int col){
        if(n<1 & col <1)
            return;
        if(n<1){
            System.out.println();
            n = col -1;
            col = col -1;
        }
        if(col !=0)
            System.out.print("*");
        patt(n-1, col);
    }

}
