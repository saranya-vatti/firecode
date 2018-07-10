import java.util.*;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {
    }

    TreeNode(int data) {
        this.data = data;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
public class Main
{
    public static TreeNode findNode(TreeNode root, int val) {
       if(root == null) return null;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode curr = st.pop();
            if(curr.data == val) return curr;
            if(curr.left != null) st.push(curr.left);
            if(curr.right != null) st.push(curr.right);
        }
        return null;
    }   
    public static void main(String[] args) {
        TreeNode l1 = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(3);
        TreeNode l4 = new TreeNode(4);
        TreeNode l5 = new TreeNode(5);
        TreeNode l6 = new TreeNode(6);
        TreeNode l7 = new TreeNode(7);
        l1.left = l2; l1.right = l3;
        l2.left = l4; l2.right = l5;
        l3.left = l6; l3.right = l7;
        System.out.println(findNode(l1, 5).data);
    }
}
