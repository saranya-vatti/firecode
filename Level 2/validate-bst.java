// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean validateBST(TreeNode root) {
    if(root==null) return true;
    boolean curr = true;
    if(root.left != null) curr = curr && (rightMost(root.left) <= root.data && root.left.data <= root.data);
    if(root.right != null) curr = curr && (root.data <= root.right.data && root.data <= leftMost(root.right));
    return validateBST(root.left) && curr && validateBST(root.right);
}
private static int rightMost(TreeNode root) {
    while(root.right!=null) {
        root=root.right;
    }
    return root.data;
}
private static int leftMost(TreeNode root) {
    while(root.left!=null) {
        root=root.left;
    }
    return root.data;
}