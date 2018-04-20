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
        return Math.max(height(x.right),height(x.left)+1);
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
    int totalSum = 0;

    public void sumOfLeaves(Node x){
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
}
