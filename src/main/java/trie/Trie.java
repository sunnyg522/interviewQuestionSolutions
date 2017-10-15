package trie;

import java.util.HashMap;
import java.util.Map;

public class Trie implements TrieInterface {

    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    public boolean isPrefix(String s) {
        return false;
    }

    public void insert(String word) {
        if(word.equals(null))
            throw new IllegalArgumentException("Invalid argument");
        HashMap<Character, TrieNode> children = root.children;

        for(int i=0;i<word.length();i++ ){
            TrieNode t;
            char c = word.charAt(i);
            if(children.containsKey(c)){
                t = children.get(c);
            }else {
                t = new TrieNode(c);
                children.put(c,t);
            }
            children = t.children;
            if(i == word.length()-1)
                t.isLeafNode = true;
        }
    }

    public boolean search(String word) {
        if(word.equals(null))
            throw new IllegalArgumentException("Invalid Argument");
        TrieNode t = searchNode(word);
        if(t !=null && t.isLeafNode)
            return true;
        else
            return false;

    }

    public boolean startsWith(String prefix) {
        if(prefix.equals(null))
            throw new IllegalArgumentException("Invalid argument");
        TrieNode t = searchNode(prefix);
        if(t==null)
            return false;
        else
            return true;
    }

    public TrieNode searchNode(String word){
        Map<Character, TrieNode> children = root.children;
        TrieNode t = null;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(children.containsKey(c)){
                t = children.get(c);
                children = t.children;
            }else {
                return null;
            }
        }
        return t;
    }
}
