// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ArrayList<Integer> inorderItr(TreeNode root) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    if(root == null) return list;
    Stack<TreeNode> st= new Stack<TreeNode>();
    TreeNode curr = root;
    while(true) {
        while(curr != null) {
            st.push(curr);
            curr = curr.left;
        }
        if(curr == null && !st.isEmpty()) {
            curr = st.pop();
            list.add(curr.data);
            curr = curr.right;
        } else {
            break;
        }
    }
    return list;
}