import trie.Trie;
import org.testng.annotations.Test;

public class TrieTest {
    @Test
    public void testTrie(){
        Trie trie = new Trie();
        trie.insert("test");
        trie.insert("tesla");
        trie.insert("testing");
        trie.insert("wall");
        trie.insert("walmart");
        trie.insert("app");
        trie.insert("apple");
        System.out.println(trie.search("tesla"));
        System.out.println(trie.startsWith("appp"));
        //System.out.println(trie.startsWith(null));
    }
}
