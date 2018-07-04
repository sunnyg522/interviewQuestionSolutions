package patterns;

/**
 * @project q
 * @authore dgunda on 6/28/18
 */
public class PrintPyramid {
    public static void main(String[] args) {
        printPyramid(5);
    }
    public static void printPyramid(int n){
        int k = 2*n-2;

        for(int i=0;i<n;i++){
            for(int j=0;j<k/2;j++){
                System.out.print(" ");
            }
            k=k-2;
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
