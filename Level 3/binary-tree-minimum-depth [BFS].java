// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int minTreeDepth(TreeNode root) {
    if(root == null) return 0;
    Stack<TreeNode> st= new Stack<TreeNode>();
    st.push(root);
    int len = 1;
    while(!st.isEmpty()) {
        Stack<TreeNode> children = new Stack<TreeNode>();
        while(!st.isEmpty()) {
            TreeNode curr = st.pop();
            if(curr.left != null) {
                children.push(curr.left);
            }
            if(curr.right != null){
                children.push(curr.right);
            }
            if(curr.left == null && curr.right == null) return len;
        }
        len++;
        st = children;
    }
    return len;
}