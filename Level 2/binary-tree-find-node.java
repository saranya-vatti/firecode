// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public TreeNode findNode(TreeNode root, int val) {
    if(root == null) return null;
    Stack<TreeNode> st= new Stack<TreeNode>();
    st.push(root);
    while(!st.isEmpty()) {
        TreeNode curr = st.pop();
        if(curr.data == val) return curr;
        if(curr.right != null) {
            st.push(curr.right);
        }
        if(curr.left != null) {
            st.push(curr.left);
        } 
    }
    return null;
}