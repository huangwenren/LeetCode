/**
 * Created by huang on 2017/10/6.
 */
public class No_513 {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int result = findBottomLeftValueHelper(root, 1, new int[]{1, root.val});
        return result;
    }


    // result[0]表示maxDepth, result[1]表示最后一层最左的数
    // 这边采用数组的原因，主要是因为数组属于引用传递而不是值传递
    private int findBottomLeftValueHelper(TreeNode treeNode, int depth, int[] result) {
        if (depth > result[0]) {
            result[0] = depth;
            result[1] = treeNode.val;
        }
        if (treeNode.left != null) findBottomLeftValueHelper(treeNode.left, depth + 1, result);
        if (treeNode.right != null) findBottomLeftValueHelper(treeNode.right, depth + 1, result);

        return result[1];
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        System.out.println(new No_513().findBottomLeftValue(root));
    }
}
