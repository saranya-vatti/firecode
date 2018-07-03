// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int findMaxItr(TreeNode root) {
    int max = root.data;
    Stack<TreeNode> st= new Stack<TreeNode>();
    st.push(root);
    while(!st.isEmpty()) {
        TreeNode curr = st.pop();
        if(curr.data >= max) {
            max = curr.data;
        }
        if(curr.right != null) {
            st.push(curr.right);
        }
        if(curr.left != null) {
            st.push(curr.left);
        } 
    }
    return max;
}