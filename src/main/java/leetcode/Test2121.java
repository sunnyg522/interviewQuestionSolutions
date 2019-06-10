package leetcode;

import linkedlist.List;

/**
 * @project q
 * @authore dgunda on 2019-06-02
 */
public class Test2121 {
    public static void main(String[] args) {
//        int[] in = {2,4,5};
//        System.out.println(minCost(in, 10));
        int[] in = {305709952,617901827,559066417,846642314,349430261,930100012,425149509,50710994,348655290,207497545,663923396,873283308,243509537,657804153,547001100,203492670,344685642,808597188,129005353,142684482,387013286,58302119,216770904,793436542,234999067,471073451,42602919,10272918,326437084,774854236,544470926,507360048};
        System.out.println(minCost(in, 612271938));


    }
    public static int minCost(int[] d, int p){
        long sum = 0;
        int v = 0;

        for(int i=0;i<d.length;i++){
            sum = sum+d[i];
        }
        long temp = Integer.MAX_VALUE;
        while(temp >p){
            temp = sum;
            v++;
            temp  = (int)Math.ceil(sum/v);
        }
        return v;
    }
}
