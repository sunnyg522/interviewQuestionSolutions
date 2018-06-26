package sort;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] a, int lo, int hi){
        if(hi<=lo)
            return;
        int j = partition(a,lo,hi);
        sort(a,lo,j);
        sort(a,j+1,hi);
    }
    public static int partition(int[] a, int lo, int hi){
        int i = lo, j = hi+1;
        while(true){
            while(less(a[++i],a[lo]))
                if(i==hi)break;
            while (less(a[lo],a[--j]))
                if(j==lo)break;
            if(i>=j)break;
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
    }

    public static boolean less(int a, int b){
        if (a<b)
            return true;
        else
            return false;
    }

    public static void exch(int[] a, int lo, int j){
        int temp;
        temp =a[lo];
        a[lo]=a[j];
        a[j]=temp;
    }



    public static void main(String[] args) {
        int[] testInput = {20,4,8,3,5,2,11,10,};
        System.out.println(Arrays.toString(testInput));
        sort(testInput,0,testInput.length-1);
        System.out.println(Arrays.toString(testInput));
    }
}
