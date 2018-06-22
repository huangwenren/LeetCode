import java.util.ArrayList;
import java.util.List;

/**
 * Created by huang on 2017/10/7.
 */
public class No_648 {
    class TrieNode {
        final int SIZE = 26;
        char val;
        TrieNode[] children;
        boolean isWord;

        public TrieNode(char val) {
            this.val = val;
            children = new TrieNode[SIZE];
        }

        public TrieNode() {
            children = new TrieNode[SIZE];
        }
    }

    TrieNode root = new TrieNode(' ');

    private void addWord(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            TrieNode next = current.children[c - 'a'];
            if (next == null) {
                current.children[c - 'a'] = new TrieNode(c);
                next = current.children[c - 'a'];
            }
            current = next;
        }
        current.isWord = true;
    }

    private String findRoot(String word) {
        TrieNode current = root;
        StringBuilder res = new StringBuilder();
        for (char c : word.toCharArray()) {
            TrieNode next = current.children[c - 'a'];
            if (next == null) {
                break;
            }
            res.append(c);
            current = next;
            if (current.isWord == true) {
                return res.toString();
            }
        }
        return word;
    }


    public String replaceWords(List<String> dict, String sentence) {
        for (String s : dict) {
            addWord(s);
        }
        String[] tokens = sentence.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = findRoot(tokens[i]);
        }
        return String.join(" ", tokens);
    }
    // 该方法效率不够高
    /*public String replaceWords(List<String> dict, String sentence) {
        String[] tokens = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String token : tokens) {
            String prefix = "";
            for (int i = 1; i <= token.length(); i++) {
                prefix = token.substring(0, i);
                if (dict.contains(prefix)) break;
            }
            result.append(" " + prefix);
        }
        return result.deleteCharAt(0).toString();
    }*/

    // 该方法不可行，在某些测试用例下会超时
    /*public String replaceWords(List<String> dict, String sentence) {
        if (dict.size() == 0) return sentence;

        String[] tokens = sentence.split(" ");

        for (String root : dict) {
            for (int i = 0; i < tokens.length; i++) {
                if (tokens[i].matches("^" + root + "[a-z]*")) {
                    tokens[i] = root;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (String token : tokens) {
            result.append(" " + token);
        }

        return result.deleteCharAt(0).toString();
    }*/
    public static void main(String[] args) {

    }

}
