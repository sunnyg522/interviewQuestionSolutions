package trie;

public interface TrieInterface {
    public boolean isPrefix(String s);
    public void insert(String word);
    public boolean search(String word);
    public boolean startsWith(String prefix);
}
