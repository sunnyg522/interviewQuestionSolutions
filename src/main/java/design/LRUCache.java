package design;


import java.util.HashMap;


/**
 * @project q
 * @authore dgunda on 7/2/18
 */
public class LRUCache {
    class Node{
        int key;
        int value;
        Node next;
        Node previous;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    int capacity;
    Node head = null;
    Node end = null;
    HashMap<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity){
        this.capacity = capacity;
    }

    public int get(int key){
        if(map.containsKey(key))
        {
            Node tmp = map.get(key);
            remove(tmp);
            setHead(tmp);
            return tmp.value;
        }
        return -1;
    }

    public void  remove(Node n){
        if(n.previous!=null){
            n.previous.next = n.next;
        }else {
                head = n.next;
        }
        if (n.next!=null){
            n.next.previous = n.previous;
        }else{
            end = n.next;
        }
    }

    public void setHead(Node n){
        n.next = head;
        n.previous = null;

        if(head!=null)
            head.previous = n;

        head = n;

        if(end ==null)
            end = head;

    }

    public void set(int key, int value){
        if(map.containsKey(key)){
            Node n = map.get(key);
            remove(n);
            setHead(n);
        }else {
            Node cr = new Node(key, value);
            if (map.size()>=capacity){
                map.remove(end.key);
                map.remove(end);
                setHead(cr);
            }else {
                setHead(cr);
            }
            map.put(key,cr);
        }

    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(5);
        lruCache.set(1, 1);
        lruCache.set(3,3);
        lruCache.set(4,4);
        lruCache.set(2,2);
        lruCache.set(5,5);
        lruCache.set(6,6);
        System.out.println(lruCache.get(6));
    }

}
