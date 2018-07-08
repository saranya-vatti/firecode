// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int maxSumPath(TreeNode root) {
    if(root == null) return 0;
    if(root.left == null && root.right == null) return root.data;
    if(root.left == null) return maxSumPath(root.right);
    if(root.right == null) return maxSumPath(root.left);
    return max(maxSumPath(root.left), maxSumPath(root.right), rootToLeaf(root.left) + root.data + rootToLeaf(root.right));
}
public static int rootToLeaf(TreeNode root) {
    if(root.left != null && root.right != null) return max(rootToLeaf(root.left), rootToLeaf(root.right), 0) + root.data;
    if(root.left != null) return rootToLeaf(root.left) + root.data;
    if(root.right != null) return rootToLeaf(root.right) + root.data;
    return root.data;
}
public static int max(int a, int b, int c) {
    if(a>=b && b>=c) return a;
    if(b>=a && b>=c) return b;
    return c;
}