package coursera.week2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] testArray = {1,7,2,5,8,6};
        System.out.println(Arrays.toString(sort(testArray)));
    }

    public static int[] sort(int[] a){
        if(a == null)
            throw new NullPointerException("Input Array is empty");
        int N = a.length;
        for(int i=0; i<N;i++){
            int min = i;
            for(int j=i+1; j<N;j++){
                if(a[min] > a[j])
                    min = j;
                exch(a,i,min);
            }

        }
        return a;
    }
    public static int[] exch(int[] inputArray, int a, int b){
        int tempA = inputArray[a];
        inputArray[a] = inputArray[b];
        inputArray[b] = tempA;
        return inputArray;
    }
}
