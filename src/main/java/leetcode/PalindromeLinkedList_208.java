package leetcode;

import linkedlist.List;

/**
 * @project q
 * @authore dgunda on 11/13/18
 */
public class PalindromeLinkedList_208 {
    public static List list = new List();
    public static List.Node left ;

    public static void main(String[] args) {
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(2);
        list.addNode(1);
        System.out.println(palindrom(list.head));
    }
//    public static boolean isPanlidromLinkedList(){
//
//    }

    public static boolean palindrom(List.Node right){
        left = list.head ;
        if(right == null)
            return true;

        boolean isp = palindrom(right.next);
        if(isp == false)
            return false;
        boolean isp1 = right.data == left.data;
        left = left.next;
        return isp1;
    }
}
