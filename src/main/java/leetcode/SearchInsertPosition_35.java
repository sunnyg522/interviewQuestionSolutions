package leetcode;

/**
 * @project q
 * @authore dgunda on 11/5/18
 */
public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int[] input = {1,3,5,6};
        System.out.println(getInsertPosition(input,5));
        System.out.println(getInsertPosition(input,2));
        System.out.println(getInsertPosition(input,7));
        System.out.println(getInsertPosition(input,0));
    }

    public static int getInsertPosition(int[] input, int target){

        int low=0, high= input.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target > input[mid])
                low = mid+1;
            else if(target<input[mid])
                high = mid-1;
            else
                return mid;
        }
        return low;
    }
}
