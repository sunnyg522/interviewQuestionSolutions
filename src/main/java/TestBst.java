import trees.BST;

public class TestBst {

    public static void main(String[] args) {
        BST<Integer, Integer> bst = new BST<Integer, Integer>();
        bst.put(50,50);
        bst.put(30,30);
        bst.put(20,20);
        bst.put(40,40);
        bst.put(60,60);
        bst.add(5,5);
//        bst.printInorder();
//        System.out.println(bst.containKey(20));
//        System.out.println(bst.size());
//        System.out.println(bst.containKey(30));
//        System.out.println(bst.get(20));
//        System.out.println(bst.containKey(100));
//        System.out.println(bst.min());
//        bst.deleteMin();
//        System.out.println(bst.min());
//        System.out.println(bst.size());
//        bst.printInorder();
        System.out.println(bst.floor(45));
    }
}
