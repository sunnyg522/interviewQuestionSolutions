package leetcode.list;

/**
 * @project q
 * @authore dgunda on 2019-03-20
 */
public class IntersectionOFTwoLinkedLists_160 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0;
        int len2 = 0;
        ListNode h1 = headA;
        ListNode h2 = headB;
        while (h1!=null){
            len1++;
            h1 = h1.next;
        }
        while (h2 !=null){
            len2++;
            h2 = h2.next;
        }
        int diff = 0;
         h1 = headA;
         h2 = headB;
         if(len1<len2){
             diff = len2 - len1;
             int i=0;
             while (i<diff){
                 h2 = h2.next;
                 i++;
             }
         }else {
             diff = len1 - len2;
             int i=0;
             while (i<diff){
                 h1 = h1.next;
                 i++;
             }
         }
         while (h1!=null && h2!=null){
             if(h1 == h2)
                 return h1;
             h1 = h1.next;
             h2 = h2.next;
         }
         return null;
    }
}
