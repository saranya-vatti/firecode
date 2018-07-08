// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

//Populate the list of ancestors from bottom to top in the below list.
public ArrayList<Integer> ancestorsList = new ArrayList<Integer>();
public boolean printAncestors(TreeNode root, int nodeData) {
    if(root == null) return false;
    HashSet<TreeNode> visited = new HashSet<>();
    Stack<TreeNode> st= new Stack<TreeNode>();
    st.push(root);
    visited.add(root);
    while(!st.isEmpty()) {
        TreeNode curr = st.peek();
        if(curr.data == nodeData) {
            st.pop();
            while(!st.isEmpty()) {
                ancestorsList.add(st.pop().data);
            }
            return true;
        }
        if(curr.left != null && !visited.contains(curr.left)) {
            visited.add(curr.left);
            st.push(curr.left);
        } else if(curr.right != null && !visited.contains(curr.right)){
            visited.add(curr.right);
            st.push(curr.right);
        } else {
            st.pop();
        }
    }
    return false;
}