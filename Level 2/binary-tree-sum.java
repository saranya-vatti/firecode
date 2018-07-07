// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int sum(TreeNode root) {
    return rec(root, 0);
}
private int rec(TreeNode root, int sum) {
    if(root == null) return sum;
    return sum + root.data + rec(root.left, sum) + rec(root.right, sum);
}