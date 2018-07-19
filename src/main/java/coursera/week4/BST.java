package coursera.week4;

import coursera.week2.Assigment2.Deque;
import edu.princeton.cs.algs4.Queue;

import java.util.NoSuchElementException;

/**
 * @project q
 * @authore dgunda on 4/5/18
 */
public class BST<Key extends Comparable<Key>, Value> {

    Node root = null;
    class Node{
        Key key;
        Value value;
        Node left;
        Node right;
        int size;
        int sum;
        public Node(Key key, Value value, int size){
            this.key = key;
            this.value = value;
            this.size = size;
            this.sum = sum;
        }
    }

    public int size(){
        return size(root);
    }

    public int size(Node x){
        if(x == null) return 0;
        else return x.size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void put(Key key, Value value){
        if(key == null)
            throw new NullPointerException("key cannt be empyt");
        if(value == null){
        }
        root = put(root, key, value);

    }
    public Value get(Key key){
        return get(root, key);
    }

    public Value get(Node x, Key key){
        if(key == null) throw new NullPointerException(" key is empty");
        int cmp = key.compareTo(x.key);
        if(cmp < 0)
            return get(x.left, key);
        else if(cmp >0)
            return get(x.right, key);
        else
            return x.value;
    }

    public Node put(Node x, Key key, Value value){
        if(x == null)
            return new Node(key, value, 1);
        int cmp = key.compareTo(x.key);

        if(cmp < 0)
            x.left = put(x.left, key, value);
        else if(cmp > 0)
            x.right = put(x.right, key, value);
        else{
            x.value = value;
        }
        x.size = 1+size(x.left)+size(x.right);
        return x;
    }

    public Key floor(Key key){
        if(key == null) throw new NullPointerException("key cannot be empty");
        if(isEmpty()) throw new NoSuchElementException("No element found in the tree");
        Node x = floor(root, key);
        if(x== null) return null;
        else return x.key;
    }

    public Node floor(Node x, Key key){
        if(x == null)
            return null;
        int cmp = key.compareTo(x.key);
        if(cmp == 0)
            return x;
        if(cmp < 0)
            return floor(x.left, key);
        Node t = floor(x.right,key);
        if(t != null)
            return t;
        else return x;
    }

    public Key ceil(Key key){
        if(key == null) throw new NullPointerException("Key cannot be null");
        if(isEmpty()) throw new NoSuchElementException("Tree is empty");
        Node x = ceil(root, key);
        if(x == null)
            return null;
        else return x.key;
    }
    public Node ceil(Node x, Key key){
        if(x == null)
            return null;
        int cmp = key.compareTo(x.key);
        if(cmp == 0)
            return x;
        if (cmp > 0)
            return ceil(x.right,key);
        Node t = ceil(x.left, key);
        if(t!=null)
            return t;
        else return x;
    }
    public int height(){
        return height(root);
    }
    public int height(Node x){
        if(x == null) return 0;
        return Math.max(height(x.right),height(x.left))+1;
    }

    public boolean isBalTree = false;
    public  void isBalanceTree(Node x){
        if(x == null)
            return;
        if(height(x.left)- height(x.right) >1){
            isBalTree = true;
            return;
        }
        isBalanceTree(x.right);
        isBalanceTree(x.left);

    }

    public void print(){
        print(root);
    }
    public void print(Node x){
        if(x == null)
            return;
        print(x.left);
        System.out.println(x.value);
        print(x.right);
    }

    public void bfs(){
        bfs(root);
    }

    public void bfs(Node x){
        Queue<Node> q = new Queue<Node>();
        q.enqueue(x);
        while (!q.isEmpty()){
            Node n = q.dequeue();
            System.out.println(n.value);
            if(n.left != null) q.enqueue(n.left);
            if(n.right != null) q.enqueue(n.right);

        }
    }

    public int widthOfTree(){
        return widthOfTree(root);
    }

    public int widthOfTree(Node x){
        int maxWidth = 0;
        Queue<Node> q = new Queue<Node>();
        q.enqueue(x);
        while (!q.isEmpty()){
            int count = q.size();
            maxWidth = Math.max(maxWidth, count);
            while (count-->0){
                Node n = q.dequeue();
                if(n.left != null) q.enqueue(n.left);
                if(n.right != null) q.enqueue(n.right);
            }
        }
        System.out.println("Max width: "+maxWidth);
        return maxWidth;
    }

    public void printZigZagOfTree(){
        printZigZagOfTree(root);
    }

    public void printZigZagOfTree(Node x){
        Deque<Node> deque = new Deque<Node>();
        boolean isOddLevel = true;
        deque.addFirst(x);
        while (!deque.isEmpty()){
            int count = deque.size();
            while (count-- > 0){
                Node n = null;
                if(isOddLevel)
                    n = deque.removeFirst();
                else
                    n = deque.removeLast();
                System.out.println(n.value);
                if(isOddLevel){
                    if(n.left != null)
                        deque.addLast(n.left);
                    if(n.right != null)
                        deque.addLast(n.right);
                }else{
                    if(n.right != null)
                        deque.addFirst(n.right);
                    if(n.left != null)
                        deque.addFirst(n.left);
                }
            }
            isOddLevel = !isOddLevel;
        }
    }

    public int sumOfLeaves(){
        sumOfLeaves(root);
         return totalSum;
    }

    public int sumOfLeavesConSolidatedReturn(){
        sumOfLeaves(root);
        return totalSum;
    }
    int totalSum = 0;

    public void sumOfLeaves(Node x){
        if(x == null) return ;
        if(x.right == null & x.left == null)
            this.totalSum = totalSum + (Integer) x.value;
        sumOfLeaves(x.left);
        sumOfLeaves(x.right);
    }

    public void sumOfLeavesConSolidatedReturn(Node x){
        if(x == null) return ;
        if(x.right == null & x.left == null)
            this.totalSum = totalSum + (Integer) x.value;
        sumOfLeaves(x.left);
        sumOfLeaves(x.right);
    }

    public int sumOfLeftANDRight(){
        return sumOfLeftANDRight(root);
    }

    public int sumOfLeftANDRight(Node x){
        if(x == null) return 0;
        x.sum = sumOfLeftANDRight(x.right) + sumOfLeftANDRight(x.left);
        return (Integer) x.value + x.sum;
    }
    public void printSum(){
        printSum(root);
    }

    public void printSum(Node x){
        if(x == null)
            return;
        print(x.left);
        System.out.println(x.sum);
        print(x.right);
    }

    public void TreeTilt(){
        TreeTilt(root);
    }

    int tiltSum = 0;
    public void TreeTilt(Node x){
        if(x == null)
            return;
        TreeTilt(x.left);
        int left = x.left == null? 0 : (Integer)x.left.value;
        int right = x.right == null ? 0 : (Integer)x.right.value;
        int diff = left - right;
        tiltSum = tiltSum+Math.abs(diff);
        System.out.println("Tilt of node : " + x.value +" is "+Math.abs(diff));
        TreeTilt(x.right);
    }

    boolean isPathSum = false;
    int tempSum = 0;
    public boolean pathSum(int totalSum){
        pathSum(root, totalSum);
        return isPathSum;
    }
    public boolean pathSum(Node x, int sum){
        if(x== null )
            return(sum == 0);
        else {
            boolean ans = false;
            int subSum = totalSum -(Integer) x.value;
            if(subSum == 0 && x.left == null && x.right == null)
                return true;
            if(x.left == null)
                ans = ans || pathSum(x.left,subSum);
            if(x.right == null)
                ans = ans || pathSum(x.right, subSum);
            return ans;
        }
    }


    public boolean isFUllBST(){
        return isFUllBST(root);
    }

    public boolean isFUllBST(Node x){
        if(x==null)
            return true;
        if(x.right == null && x.left == null)
            return true;
        if(x.right!=null && x.left !=null)
            return isFUllBST(x.right) && isFUllBST(x.left);
        return false;
    }

    public void printRootToLeaf(){
        int path[] = new int[1000];
        printRootToLeaf(root, path, 0);
    }
    public void printRootToLeaf(Node x, int path[], int pathLen){
        if(x == null)
            return;
        path[pathLen] = (Integer) x.value;
        pathLen++;
        if(x.left == null && x.right == null){
            printArray(path, pathLen);
        }
        printRootToLeaf(x.left, path, pathLen);
        printRootToLeaf(x.right,path, pathLen);

    }
    public void printArray(int[] arr, int pathLen){
        for (int i=0;i<pathLen;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public int closestValueInBinaryTree(int input){
          closestValueInBinaryTree(root, input, Integer.MAX_VALUE);
          return closeValue;
    }
    public int closeValue;
    public void closestValueInBinaryTree(Node x, int input, int newDiff){
        if(x==null)
            return;
        int diffOfNum = Math.abs((Integer)x.value - input);
        if(diffOfNum<newDiff) {
            newDiff = diffOfNum;
            closeValue = (Integer)x.value;
        }
        closestValueInBinaryTree(x.left, input, newDiff);
        closestValueInBinaryTree(x.right, input, newDiff);

    }
    public void addOneNodeToTree(Node x, int depth, Key key, Value value){
        if (x==null)
            return;
        if(height(x) == depth){
            Node tempLeft = x.left;
            Node tempRiht = x.right;
            x.value = value;
            Node left = new Node(key, value, 1);
            Node right =  new Node(key, value, 1);
            left.left = tempLeft;
            right.right = tempRiht;
        }else if (depth == 1){
            Node n = new Node(key, value, 1);
            n.left = x;
        }
        addOneNodeToTree(x.left, depth, key, value);
        addOneNodeToTree(x.right, depth,key,value);
    }
    /**
     * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
     * For example, this binary tree is symmetric:
     *     1
          / \
         2   2
        / \ / \
       3  4 4  3
     * But the following is not:
            1
           / \
          2   2
          \   \
          3    3
     * Note:
     * Bonus points if you could solve it both recursively and iteratively.
     */
    public boolean isTreeSymentric(Node left, Node right){
        if (left == null && right == null)
            return true;
        if(left==null || right == null)
            return false;
        if(left.value != right.value)
            return false;
        return isTreeSymentric(left.left, right.right) && isTreeSymentric(left.right,right.left);

    }
}
