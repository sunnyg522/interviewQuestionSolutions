package coursera.week2;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] testArray = {1,7,2,5,8,6};
        System.out.println(Arrays.toString(sort(testArray)));
    }

    public static int[] sort(int[] a){
        if(a == null)
            throw new NullPointerException();
        int N = a.length;
        for(int i=0 ; i<N ; i++){
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1])
                    exch(a,j, j-1);
                else
                    break;
            }
        }
        return a;
    }

    public static int[] exch(int[] a, int b, int c){
        int temp = b;
        a[b] = a[c];
        a[c] = a[temp];
        return a;
    }

}
