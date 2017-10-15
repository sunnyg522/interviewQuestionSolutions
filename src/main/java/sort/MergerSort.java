package sort;

import java.util.Arrays;

public class MergerSort {
    public static void merge(int[] a,int[] aux, int lo, int mid, int hi){
        //copy to aux
        for(int k=lo;k<=hi;k++){
            aux[k] = a[k];
        }

        //Merger implementation
        int i = lo, j = mid+1;
            for(int k=lo;k<=hi;k++){
                if(i>mid)
                    a[k]=aux[j++];
                else if(j>hi)
                    a[k]=aux[i++];
                else if(a[i]<a[j])
                    a[k]=aux[i++];
                else
                    a[k]=aux[j++];
            }
    }
    public static void sort(int[]a, int[] aux, int lo, int hi){
        if(hi<=lo)
            return;
        int mid = lo +(hi-lo)/2;
        sort(a, aux,lo,mid);
        sort(a, aux,mid+1,hi);
        merge(a, aux, lo, mid, hi);
    }

//    public static void sort(int[] a){
//        int[] aux = new int[a.length];
//        sort(a,aux,0,a.length-1);
//    }

    public static void main(String[] args) {
        int[] testInput = {20,4,8,3,5,2,11,10,};
        System.out.println(Arrays.toString(testInput));
        int[] aux = new int[testInput.length];
        sort(testInput,aux,0,testInput.length-1);
        System.out.println(Arrays.toString(testInput));
    }


}
