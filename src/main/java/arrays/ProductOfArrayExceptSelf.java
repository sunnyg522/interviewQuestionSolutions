package arrays;

import java.util.Arrays;

/**
 * @project q
 * @authore dgunda on 7/18/18
 */
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] input = {0,0};
        System.out.println(Arrays.toString(productOfArrayexcSelf(input)));
    }
    public static int[] productOfArrayexcSelf(int[] a){
        boolean is0InArray = false;
        int totalProduct = 1;
        int[] outPutArray = new int[a.length];
        for(int i=0; i<a.length; i++){
            if (a[i] != 0)
                totalProduct = totalProduct*a[i];
            else
                is0InArray = true;
        }

        for(int i=0; i<a.length; i++){
            if(a[i] == 0)
                outPutArray[i] = totalProduct;
            else if(!is0InArray)
                outPutArray[i] = totalProduct/a[i];
            else
                outPutArray[i] = 0;
        }
        return outPutArray;
    }
}
