package trees;

import java.util.NoSuchElementException;

public class BST<Key extends Comparable<Key>, Value> {
    private Node root;
    private class Node{
        private Key key;
        private Value value;
        private Node left, right;
        private int size;

        public Node(Key key, Value value, int size){
            this.key = key;
            this.value = value;
            this.size = size;
        }
    }
    public BST(){

    }
    // to check if the tree is empty
    public boolean isEmpty(){
        return size() == 0;
    }

    //size of method
    public int size(){
        return size(root);
    }

    //size of method overloaded.
    public int size(Node x){
        if(x == null)
            return 0;
        else
            return x.size;
    }

    public boolean containKey(Key key){
        if(key == null)
            throw new IllegalArgumentException("Key cannot be null");
        else
            return get(key) !=null;
    }

    public Value get(Key key){
        return get(root, key);
    }

    public Value get(Node x, Key key){
        if(key ==null)
            throw new IllegalArgumentException("Calling get() with null key");
        if(x == null)
            return null;
        int cmp = key.compareTo(x.key);
        if(cmp > 0)
            return get(x.right, key);
        else if(cmp < 0)
            return get(x.left, key);
        else
            return x.value;
    }

    public void put(Key key, Value value){
        if(key == null)
            throw new IllegalArgumentException("key should not be null");
        root = put(root, key, value);
    }

    public Node put(Node n, Key key, Value value){
        if(n== null)
            return new Node(key,value,1);
        int cmp = key.compareTo(n.key);
        if(cmp < 0)
            n.left = put(n.left, key, value);
        else if(cmp > 0)
            n.right =  put(n.right, key, value);
        else
            n.value = value;
        n.size = 1+size(n.left)+size(n.right);
        return n;
    }

    public void deleteMin(){
        if(this.isEmpty())
            throw new NoSuchElementException("no element to delete");
        else
            root = deleteMin(root);
    }

    public Node deleteMin(Node x){
        if(x.left == null)
            return x.right;
        x.left = deleteMin(x.left);
        x.size = 1+size(x.left)+size(x.right);
        return x;
    }

    public void deleteMax(Node right, Key key){
        if(this.isEmpty())
            throw new NoSuchElementException("No element found in tree to delete");
        else
            root = deleteMax(root);
    }

    public Node deleteMax(Node x){
        if(x.right == null)
            return x.left;
        x.right = deleteMax(x.right);
        x.size = 1+size(x.right)+size(x.right);
        return x;
    }

    public void delete(Key key){
        if(key == null)
            throw new IllegalArgumentException("Invalid key");
        else if(isEmpty())
            throw new NoSuchElementException("No element to delete");
        else
            root = delete(root, key);

    }

    private Node delete(Node x, Key key) {
        int cmp = key.compareTo(x.key);
        if(cmp < 0 )
            x.right = delete(x.right, key);
        else if(cmp >0)
            x.right = delete(x.left, key);
        else{
            if(x.right == null)
                x = x.left;
            else if(x.left == null)
                x = x.right;
            Node t = x;
            x=min(t.right);
            x.right = deleteMin(t.right);
            x.left = t;
        }
        x.size = 1+size(x.left)+size(x.right);
        return root;
    }

    public Key min(){
        if(isEmpty())
            throw new NoSuchElementException("No element in tree to delete");
        else
            return min(root).key;
    }
    private Node min(Node x){
        if(x.left == null)
            return x;
        else
            return min(x.left);

    }

    public Key max(){
        if(isEmpty())
            throw new NoSuchElementException("No element in tree to delete");
        else
            return max(root).key;
    }

    private Node max(Node x){
        if(x.right == null)
            return x;
        else
            return max(x.right);
    }

    public void add(Key key, Value value){
        if(key == null)
            throw new IllegalArgumentException("Invalid key");
        else
            root = add(root, key, value);
    }

    public Node add(Node x, Key key , Value value){
        if(x== null){
            x = new Node(key, value, 1);
        }
        int cmp = key.compareTo(x.key);
        if(cmp<0)
            x.left = add(x.left, key, value);
        else if(cmp >0)
            x.right = add(x.right, key, value);
        else
            x.value = value;
        x.size = 1+size(x.left)+size(x.right);
        return x;
    }

    public void printInorder(){
        printInorder(root);
    }

    private void printInorder(Node x){
        if (x==null)
            return;
        printInorder(x.left);
        System.out.println(x.value);
        printInorder(x.right);
    }
    public Key floor(Key key){
        if(key == null)
            throw new IllegalArgumentException("Key cannot be null");
        if(isEmpty())
            throw new NoSuchElementException("Table is under flown");
        Node x = floor(root, key);
        if(x==null)
            return null;
        else
            return x.key;
    }
    private Node floor(Node x, Key key){
        if(x==null)
            return null;
        int cmp = key.compareTo(key);
        if(cmp == 0)
            return x;
        if(cmp< 0)
            return floor(x.left,key);
        Node t = floor(x.right,key);
        if(t !=null)
            return t;
        else
            return x;
    }

    public Key ceiling(Key key){
        if(key == null)
            throw new IllegalArgumentException("Key cannot be null");
        if(isEmpty())
            throw new NoSuchElementException("Table is under flown");
        Node x = ceiling(root, key);
        if (x == null)
            return null;
        else
            return x.key;
    }

    public Node ceiling(Node x, Key key){
        if(x==null)
            return null;
        int cmp = key.compareTo(x.key);
        if(cmp == 0)
            return x;
        if(cmp < 0){
            Node t = ceiling(x.left, key);
            if(t !=null)
                return t;
            else return x;
        }
        return ceiling(x.right,key);
    }


}
