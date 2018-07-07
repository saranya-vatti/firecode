// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int sumItr(TreeNode root) { 
    if(root == null) return 0;
    int sum = 0;
    Stack<TreeNode> st= new Stack<TreeNode>();
    st.push(root);
    while(!st.isEmpty()) {
        TreeNode curr = st.pop();
        sum += curr.data;
        if(curr.right != null) {
            st.push(curr.right);
        }
        if(curr.left != null) {
            st.push(curr.left);
        } 
    }
    return sum;
}