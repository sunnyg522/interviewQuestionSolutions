package coursera.week4;

import org.testng.annotations.Test;

/**
 * @project q
 * @authore dgunda on 4/6/18
 */
public class BSTTest {
    @Test
    public void testPutMethod(){
        //BST<Integer, String> bst = new BST<Integer, String>();
        BST<Integer, Integer> bst = new BST<Integer, Integer>();

        /**
         *              5                 //E
         *       1            7           //GA
         *           3      6   8        //CFH
         *        2    4          9     // IDB
         *                          10  //J
         */


      /*  bst.put(5,"E");
        bst.put(1,"A");
        bst.put(3,"C");
        bst.put(2,"B");
        bst.put(4,"D");
        bst.put(7,"G");
        bst.put(6,"F");
        bst.put(8,"H");
        bst.put(9,"I");
        bst.put(10,"J");
*/
        bst.put(5,5);
        bst.put(1,1);
        bst.put(3,3);
        bst.put(2,2);
        bst.put(4,4);
        bst.put(7,7);
        bst.put(6,6);
        bst.put(8,8);
        bst.put(9,9);
        bst.put(10,10);


        bst.print();
        bst.serialize(bst.root);
        bst.print(bst.deserialize("5,1,7,#,3,6,8,2,4,#,#,#,9,#,#,#,#,#,10,#,#"));
        System.out.println("++++++++");
        System.out.println(bst.ceil(6));
        System.out.println("++++++++");
        System.out.println(bst.floor(6));
        System.out.println("++++++++");
        System.out.println(bst.size());
        System.out.println("++++++++");
        System.out.println(bst.isEmpty());
        System.out.println("++++++++");
        System.out.println("height"+bst.height());
        System.out.println("bfs");
        bst.bfs();
        bst.widthOfTree();
        System.out.println("++++++++");
        bst.printZigZagOfTree();
        System.out.println("++++++++");
        System.out.println(bst.sumOfLeaves());
        System.out.println("++++++++");
        System.out.println(bst.sumOfLeftANDRight());
        System.out.println("++++++++");
        bst.printSum();
        System.out.println("is full bst  :   "+bst.isFUllBST());

        System.out.println("++++++++ Tree tilt");
        bst.TreeTilt();
        System.out.println(bst.tiltSum);

        System.out.println("path sum");
        System.out.println(bst.pathSum(11));

        System.out.println(" is balance tree");
        bst.isBalanceTree(bst.root);
        System.out.println(bst.isBalTree);
        System.out.println("print root to path");
        bst.printRootToLeaf();
        System.out.println("Closest Value");
        System.out.println(bst.closestValueInBinaryTree(0));
        System.out.println("Add one Node to Tree");
        bst.addOneNodeToTree(bst.root,1,2,2);
        bst.print();

    }
}
