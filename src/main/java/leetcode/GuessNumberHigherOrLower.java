package leetcode;

/**
 * @project q
 * @authore dgunda on 2019-03-18
 */
public class GuessNumberHigherOrLower {
    public static void main(String[] args) {

    }
    public static int gusss(int mid){
        return 1;
    }
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low<=high){
            int mid = (low + (high - low))/2;
            int result = gusss(mid);
            if (result == 0){
                return result;
            }else if(result == 1){
                low = mid+1;
            }else
                high = mid-1;
        }
        return -1;
    }
}
