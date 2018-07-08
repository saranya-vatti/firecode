// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int diameter(TreeNode root) {
    if(root == null) return 0;
    if(root.left == null && root.right == null) return 1;
    if(root.left == null) {
        if(diameter(root.right) == findHeight(root.right)) {
            return findHeight(root.right) + 1;
        }
        return diameter(root.right);
    }
    if(root.right == null) {
        if(diameter(root.left) == findHeight(root.left)) {
            return findHeight(root.left) + 1;
        }
        return diameter(root.left);
    }
    return findHeight(root.left) + findHeight(root.right) + 1;
}