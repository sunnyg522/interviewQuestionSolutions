package linkedlist;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddingTwoNumbers {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l1.add(9);
        l1.add(5);
        l1.add(9);
        l2.add(6);
        l2.add(5);
        System.out.println(addTwoList(l1,l2).toString());

    }
    public static List<Integer> addTwoList(List l1, List l2){
        Iterator it1 = l1.iterator();
        Iterator it2 = l2.iterator();
        int carry = 0;
        LinkedList<Integer> l = new LinkedList<Integer>();
        while (it1.hasNext() || it2.hasNext()){
            int x = it1.hasNext()? (Integer) it1.next() :0;
            int y = it2.hasNext()? (Integer) it2.next() :0;
            int sum = x+y+carry;
            carry=sum/10;
//            it1.next();
//            it2.next();
            l.add(sum%10);
        }
        if(carry!=0)
            l.add(carry);
        return l;
    }
}
