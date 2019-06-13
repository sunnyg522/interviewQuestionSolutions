package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-06-11
 */
public class MonotonicArray_896 {
    public static void main(String[] args) {

    }
    public static boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        for(int i = 0;i<A.length-1;i++){
            if(A[i]>A[i-1])
                increasing = false;
            if(A[i]<A[i-1])
                decreasing = false;
        }
        return increasing || decreasing;
    }
}
