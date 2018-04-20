package coursera.week4;

/**
 * @project q
 * @authore dgunda on 4/5/18
 */
public class BinarySearch {
    public static void main(String[] args) {

        int[] input = {1,3,4,6,7};
        System.out.println(rank(7,input));
    }
    public static void get(int key){

    }

    public static int rank(int key, int[] input){
        int lo = 0, hi = input.length-1;
        while (lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(key < input[mid]) hi = mid-1;
            else if(key > input[mid]) lo = mid +1;
            else return mid;
        }
        return lo;
    }
}
