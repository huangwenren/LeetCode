/**
 * Created by huang on 2017/10/8.
 */
public class No_404 {
    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root);
    }

    private int dfs(TreeNode treeNode) {
        if (treeNode == null) return 0;

        if (treeNode.left != null) {
            if (treeNode.left.left == null && treeNode.left.right == null) {
                sum += treeNode.left.val;
            } else {
                dfs(treeNode.left);
            }
        }
        dfs(treeNode.right);

        return sum;
    }
}
