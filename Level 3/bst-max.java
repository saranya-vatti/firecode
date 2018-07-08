// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public TreeNode findMax(TreeNode root) {
    while(root != null && root.right!=null) root=root.right;
    return root;
}