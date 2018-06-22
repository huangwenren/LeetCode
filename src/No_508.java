import java.util.*;

/**
 * Created by huang on 2017/10/7.
 */
public class No_508 {

    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> result = new HashMap<>();
        dfs(root, result);
        int max = 0;
        Set<Integer> keySet = result.keySet();
        for (Integer key : keySet) {
            if (result.get(key) > max) {
                max = result.get(key);
            }
        }

        List<Integer> tmp = new ArrayList<>();
        for (Integer key : keySet) {
            if (result.get(key) == max) {
                tmp.add(key);
            }
        }

        int[] finalResult = new int[tmp.size()];
        for (int i = 0; i < finalResult.length; i++) {
            finalResult[i] = tmp.get(i);
        }

        return finalResult;
    }

    public int dfs(TreeNode treeNode, Map<Integer, Integer> result) {
        if (treeNode == null) {
            return 0;
        }
        int left = treeNode.left == null ? 0 : dfs(treeNode.left, result);
        int right = treeNode.right == null ? 0 : dfs(treeNode.right, result);
        int sum = treeNode.val + left + right;
        result.put(sum, result.getOrDefault(sum, 0) + 1);

        return sum;
    }
}
