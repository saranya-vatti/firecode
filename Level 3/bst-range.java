// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public  ArrayList<Integer> rangeList = new ArrayList<Integer>();
public void printRange(TreeNode root, int a, int b) {
    if(root == null) return;
    Stack<TreeNode> st= new Stack<TreeNode>();
    TreeNode curr = root;
    while(true) {
        while(curr != null) {
            st.push(curr);
            curr = curr.left;
        }
        if(curr == null && !st.isEmpty()) {
            curr = st.pop();
            if(curr.data >= a && curr.data <= b) rangeList.add(curr.data);
            curr = curr.right;
        } else {
            break;
        }
    }
}