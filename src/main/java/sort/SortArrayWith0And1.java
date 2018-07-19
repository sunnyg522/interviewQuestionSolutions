package sort;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 7/18/18
 */
public class SortArrayWith0And1 {
    public static void main(String[] args) {
        int[] in = {1,0,0,0,1,0,1,1,0,0};
        System.out.println(Arrays.toString(sort(in)));
    }
    public static int[] sort(int[] in){
        int indexOf0 = 0;
        int indexof1 = in.length-1;
        while(indexOf0 < indexof1){
            if(in[indexOf0] !=1)
                indexOf0++;
            else if(in[indexof1]!=0)
                indexof1--;
            else if(in[indexOf0] == 1 && in[indexof1] == 0 )
                swap(in,indexOf0, indexof1);
        }
        return in;
    }
    public static void swap(int[] in, int a, int b){
        int temp = in[a];
        in[a] = in[b];
        in[b] = temp;
    }
}
