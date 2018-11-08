package algos;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Input :  arr1[] = { 1, 3, 4, 5}
 * arr2[] = {2, 4, 6, 8}
 * Output : arr3[] = {1, 2, 3, 4, 5, 6, 7, 8}
 * @project q
 * @authore dgunda on 7/18/18
 */
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 5};
        int arr2[] = {2, 4, 6, 8};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
        System.out.println(Arrays.toString(mergerTwoSortedArrays(arr1,arr2)));
    }

    public static int[] merge(int[]  a, int[] b){
        int[] aux = new int[a.length+b.length];
        int i =0;
        int j=0;
        int p=0;
        while(i< a.length && j<b.length){
            if(a[i]>b[j]) {
                aux[p] = b[j];
                j++;
                p++;
            }else{
                aux[p] = a[i];
                i++;
                p++;
            }
        }
        while (i<a.length)
        {
            aux[p] = a[i++];
            i++;
            p++;
        }
        while(j<b.length){
            aux[p] = b[j];
            j++;
            p++;
        }
        return aux;
    }

    public static int[] mergerTwoSortedArrays(int[] a, int[] b){
        int i=0, j=0,k=0;
        int[] c = new int[a.length+b.length];
        while (i<a.length && j<b.length){
            if(a[i]<b[j]) {
                c[k++] = a[i++];
            }else
                c[k++] = b[j++];
        }
        while (i<a.length)
        {
            c[k++] = a[i++];
        }
        while (j<b.length){
            c[k++] = b[j++];
        }
        return c;
    }
}
