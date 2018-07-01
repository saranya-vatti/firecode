// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int findHeight(TreeNode root) { 
    if(root == null) return 0;
    return max(findHeight(root.left), findHeight(root.right)) + 1;
}
private int max(int a, int b) {
    return a >= b ? a : b;
}