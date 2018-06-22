/**
 * Created by huang on 2017/10/4.
 */
public class No_617 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode treeNode = new TreeNode(val);

        treeNode.left = mergeTrees(t1.left == null ? null : t1.left, t2.left == null ? null : t2.left);
        treeNode.right = mergeTrees(t1.right == null ? null : t1.right, t2.right == null ? null : t2.right);

        return treeNode;
    }
}
