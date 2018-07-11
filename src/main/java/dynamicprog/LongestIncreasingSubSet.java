package dynamicprog;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 7/4/18
 */
public class LongestIncreasingSubSet {
    public static void main(String[] args) {
        int[] arr = {3, 2};
        int[] arr2 = {50, 3, 10, 7, 40, 80};
        System.out.println(LIS(arr,arr.length));
        System.out.println(LIS(arr2,arr2.length));
    }
    public static int LIS(int s[], int n){
        int[] len = new int[n];

        Arrays.fill(len,1);
        for (int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(s[i]>s[j] && len[i]<len[j]+1){
                    len[i] = len[j]+1;
                }
            }
        }
        int max=0;
        for (int i=0;i<n; i++){
            max = Math.max(max, len[i]);
        }
        return max;
    }
}
