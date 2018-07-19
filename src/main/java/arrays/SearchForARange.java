package arrays;

import java.util.Arrays;

/**
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1]. For example,
 * given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4].
 * @project q
 * @authore dgunda on 7/18/18
 */
public class SearchForARange {
    public static void main(String[] args) {
        int[] input = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(rangeSearch(input, 8)));
    }
    public static void binarySearch(int[] in, int target, int left, int right, int[] arr){
        if(right<left)
            return;

        if(in[left] == in[right] && in[left] == target){
            arr[0] = left;
            arr[1] = right;
            return;
        }
        int mid = left+(right-left)/2;
        if(in[mid]<target){

            binarySearch(in, target, mid+1, right,arr);
        }else if(in[mid]<target)
            binarySearch(in, target, left,mid-1,arr);
        else{
            arr[0] = mid;
            arr[1] = mid;

            int t1 = mid;
            while(t1>left && in[t1] == in[t1-1]){
                t1--;
                arr[0] = t1;
            }

            int t2 = mid;
            while (t1<right && in[t2] == in[t2+1]){
                t2++;
                arr[1] = t2;
            }
            return;
        }
    }
    public static int[] rangeSearch(int[] in, int target){
        if(in == null || in.length == 0){
            return null;
        }
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        binarySearch(in,target,0,in.length-1, arr);
        return arr;
    }
}
