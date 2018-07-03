// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ArrayList<Integer> preorderItr(TreeNode root) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    if(root == null) return list;
    Stack<TreeNode> st= new Stack<TreeNode>();
    st.push(root);
    while(!st.isEmpty()) {
        TreeNode curr = st.pop();
        list.add(curr.data);
        if(curr.right != null) {
            st.push(curr.right);
        }
        if(curr.left != null) {
            st.push(curr.left);
        } 
    }
    return list;
}