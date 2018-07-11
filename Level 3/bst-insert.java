// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public TreeNode insert(TreeNode root, int data) { 
    if(root == null) {
        root = new TreeNode(data);
        return root;
    }
    TreeNode parent = root;
    TreeNode curr;
    boolean isLeft = true;
    if(data == root.data) return root;
    else if(data < root.data) {
        curr = root.left;
        isLeft = true;
    }
    else {
        curr = root.right;
        isLeft = false;
    }
    while(curr!=null) {
        if(data == curr.data) return root;
        else if(data < curr.data) {
            parent = curr;
            curr = curr.left;
            isLeft = true;
        }
        else {
            parent = curr;
            curr = curr.right;
            isLeft = false;
        }
    }
    curr = new TreeNode(data);
    if(isLeft) parent.left = curr;
    else parent.right = curr;
    return root;
}