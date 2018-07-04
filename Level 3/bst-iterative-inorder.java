// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean validateBSTItr(TreeNode root) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    if(root == null) return true;
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
    System.out.println(Arrays.toString(list.toArray()));
    int prev = list.get(0);
    for(int i=1;i<list.size();i++) {
        if(prev>list.get(i)) return false;
        prev = list.get(i);
    }
    return true;
}