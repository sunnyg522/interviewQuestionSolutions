package trie;

import java.util.HashMap;

public class TrieNode {
    char c;
    HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();

    public TrieNode(){}
    public TrieNode(char c){
        this.c = c;
    }
    boolean isLeafNode;
}
