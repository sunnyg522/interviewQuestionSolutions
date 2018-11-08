package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @project q
 * @authore dgunda on 11/4/18
 */
public class AddTwoNumbers_2 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(9);
        l2.add(9);
        l2.add(9);
        System.out.println(add2Nums(l1,l2).toString());
    }
    public static List<Integer> add2Nums(List l1, List l2){
        List l3 = new ArrayList<Integer>();
        int carry = 0;
        for(int i=0; i<(l1.size()>l2.size()?l1.size():l2.size()); i++){
             int a = 0, b=0;
             a = l1.isEmpty() ? 0 : (int) l1.get(i);
             b = l2.isEmpty() ? 0 : (int) l2.get(i);
             int temp = carry+a+b;
             if(temp>9)
                 carry = temp / 10;
             else
                 carry = 0;
             l3.add(temp%10);
        }
        if(carry>0)
            l3.add(carry);
        return l3;
    }
}
