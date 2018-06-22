/**
 * Created by huang on 2017/10/4.
 */
public class No_226 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        if (root.left != null) invertTree(root.left);
        if (root.right != null) invertTree(root.right);

        return root;
    }
}
