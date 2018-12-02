package leetcode;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 11/19/18
 */
public class MedianOfTwoSortedArrays_4 {
    public static void main(String[] args) {
        int[] num1 = {1,3};
        int[] num2 = {2};
        System.out.println(meadianOfSortedArrays(num1, num2));
    }
    public static int meadianOfSortedArrays(int[] a, int[] b){
        int i=0;
        int j=0;
        int totalLen = a.length+b.length;
        int[] aux = new int[totalLen];
        for(int k=0; k<totalLen;k++){
            if(i>a.length)
                aux[k] = b[j++];
            else if(j> b.length)
                aux[k] = a[i++];
            else if(a[i]>a[j])
                aux[k] = b[j++];
            else
                aux[k] = a[i++];
        }
        System.out.println(Arrays.toString(aux));
        if(totalLen%2 == 0)
            return (aux[totalLen/2]+aux[(totalLen/2)+1])/2;
        else
            return aux[totalLen/2];
    }

    public static int meadianOfSortedArraysOpt(int[] a, int[] b){
        int i=0;
        int j=0;
        int totalLenTemp = a.length+b.length;
        int totalLen = (totalLenTemp)%2==0?(totalLenTemp/2)+1:totalLenTemp/2;
        int c=-1, d=-1;
        int count = 0;
        while(count<totalLen){
            if(i>a.length)
                j++;
            else if(j>b.length)
                i++;
            else if(a[i]>b[j])
                j++;
            else
                i++;
        }
        return 0;
    }
}
