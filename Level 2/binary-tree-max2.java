// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int findMax(TreeNode root) {
    if(root == null) return 0;
    return max(findMax(root.left), root.data, findMax(root.right));
}
public static int max(int a, int b, int c) {
    if(a>=b && b>=c) return a;
    if(b>=a && b>=c) return b;
    return c;
}