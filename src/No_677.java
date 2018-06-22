import java.util.HashMap;
import java.util.Map;

/**
 * Created by huang on 2017/10/8.
 */
public class No_677 {
    class TrieNode {
        private Map<Character, TrieNode> children;
        private int val;

        public TrieNode() {
            children = new HashMap<>();
            this.val = 0;
        }
    }

    private TrieNode root;

    public No_677() {
        root = new TrieNode();
    }

    public void insert(String key, int val) {
        TrieNode current = root;
        for (char c : key.toCharArray()) {
            TrieNode next = current.children.get(c);
            if (next == null) {
                next = new TrieNode();
                current.children.put(c, next);
            }
            current = next;
        }
        current.val = val;
    }

    public int sum(String prefix) {
        TrieNode current = root;
        for (char c : prefix.toCharArray()) {
            TrieNode next = current.children.get(c);
            if (next == null) {
                return 0;
            }
            current = next;
        }
        return dfs(current);
    }

    private int dfs(TrieNode trieNode) {
        int sum = 0;
        for (char c : trieNode.children.keySet()) {
            if (trieNode.children.get(c) != null) {
                sum += dfs(trieNode.children.get(c));
            }
        }

        sum += trieNode.val;
        return sum;
    }
}
