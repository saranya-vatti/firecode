// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int pathLengthFromRoot(TreeNode root, int n1) {
    Stack<TreeNode> st= new Stack<TreeNode>();
    st.push(root);
    int len = 1;
    while(!st.isEmpty()) {
        Stack<TreeNode> children = new Stack<TreeNode>();
        while(!st.isEmpty()) {
            TreeNode curr = st.pop();
            if(curr.data == n1) return len;
            if(curr.left != null) {
                children.push(curr.left);
            }
            if(curr.right != null){
                children.push(curr.right);
            }
        }
        len++;
        st = children;
    }
    return len;
}