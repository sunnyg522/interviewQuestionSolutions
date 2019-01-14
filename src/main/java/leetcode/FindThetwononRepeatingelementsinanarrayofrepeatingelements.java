package leetcode;

/**
 * @project q
 * @authore dgunda on 12/16/18
 */
public class FindThetwononRepeatingelementsinanarrayofrepeatingelements {
    public static void main(String[] args) {
        getTwoNonRepet(new int[] {2, 3, 7, 9, 11, 2, 3, 11});
    }
    public static void getTwoNonRepet(int[] a){
        int xor = a[0];
        for(int i=1;i<a.length;i++){
            xor = xor ^ a[i];
        }
        System.out.println(xor);

    }
}
