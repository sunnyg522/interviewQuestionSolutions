package coursera.week2;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class ShuffelSort {
    public static void main(String[] args) {
        int[] testInput = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(sort(testInput)));

    }
    public static int[] sort(int[] a){
        for (int i=0;i<a.length;i++){
            exch(a,i, StdRandom.uniform(i+1));
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
