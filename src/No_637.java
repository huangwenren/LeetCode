import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by huang on 2017/10/4.
 */
public class No_637 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.offer(root);

        List<Double> result = new ArrayList<>();
        while (!treeNodeQueue.isEmpty()) {
            double sum = 0.0;
            int queueSize = treeNodeQueue.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode current = treeNodeQueue.poll();
                sum += current.val;
                if (current.left != null) treeNodeQueue.offer(current.left);
                if (current.right != null) treeNodeQueue.offer(current.right);
            }
            result.add(sum / queueSize);
        }
        return result;
    }
}
