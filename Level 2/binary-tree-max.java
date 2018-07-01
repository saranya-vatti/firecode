// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int findMax(TreeNode root) {
    if (root == null) return 0;
    if (root.left == null && root.right==null) return root.data;
    if (root.left == null) return root.data > root.right.data ? root.data : root.right.data;
    if (root.right == null) return root.data > root.left.data ? root.data : root.left.data;
    return max(findMax(root.left), root.data, findMax(root.right));
}
private int max(int a, int b, int c) {
    if (a >= b && a >= c) return a;
    if (b >= a && b >= c) return b;
    return c;
}