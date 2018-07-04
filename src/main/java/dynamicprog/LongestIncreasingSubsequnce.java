package dynamicprog;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 6/26/18
 */
public class LongestIncreasingSubsequnce {
    public static void main(String[] args) {
        int arr[] = {3, 10, 2, 1, 20};
        System.out.println(lis(arr));
    }
    public static int lis(int[] input){
        int max=0;
        int li[] = new int[input.length];
        Arrays.fill(li, 1);
        for(int i =1;i<input.length;i++){
            for(int j=0; j<i;j++){
                if(input[i]<input[j] && li[i]<li[j]+1)
                    li[i] = li[j]+1;
            }
        }
        for (int i = 0; i<input.length;i++){
            if(max<li[i])
                max = li[i];
        }
        return max;
    }
}
