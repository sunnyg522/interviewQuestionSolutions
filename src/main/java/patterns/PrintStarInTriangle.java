package patterns;

/**
 * @project q
 * @authore dgunda on 6/28/18
 */
public class PrintStarInTriangle {
    public static void main(String[] args) {
       printRightTriangle(5);
       printRightTriangleRotated180(5);
    }
    public static void printRightTriangle(int n){
        for(int i=0;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printRightTriangleRotated180(int n){
        int k = 2*n-2;
        for (int i =0;i<n;i++){
            for (int j=0;j<k;j++){
                System.out.print(" ");
            }
            k=k-2;
            for (int j=0;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");

        }
    }
}
