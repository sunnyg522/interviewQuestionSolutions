package trees;

public class BinaryTree<Key extends Comparable<Key>, Value> {
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

    public boolean isEmpty(){
      return size(root)==0;
    }
    public int size(Node x){
        if(x.size != 0)
            return x.size;
        else
            return 0;
    }
    public int size(){
        if(root.size == 0)
            return 0;
        else
            return root.size;
    }
    public Value get(Key key){return get(root, key);}

    public Value get(Node n, Key key){
        if(key == null)
            throw new NullPointerException("key cannot be null");
        if(n == null)
            return null;
        if(key.compareTo(n.key) < 0)
            return get(n.left, key);
        else if(key.compareTo(n.key) > 0)
            return get(n.right, key);
        else
            return n.value;
    }


    public void put(Key key, Value value){}

//    public Node put(Node n, Key key, Value value){
//        if(key == null)
//            throw new NullPointerException("key cannot be null");
//        if(key.compareTo(n.key)<0)
//            n.left = put(n.left, key, value);
//        else if(key.compareTo(n.key)>0)
//            n.right = put(n.right, key, value);
//        else
//            new Node(key, value)
//    }
}