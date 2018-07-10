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
    public static ArrayList<Integer> preorderItr(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;
        Stack<TreeNode> st= new Stack<TreeNode>();
        TreeNode curr = root;
        while(true) {
            while(curr != null) {
                st.push(curr);
                list.add(curr.data);
                curr = curr.left;
            }
            if(curr == null && !st.isEmpty()) {
                curr = st.pop();
                curr = curr.right;
            } else {
                break;
            }
        }
        return list;
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
        System.out.println(Arrays.toString(preorderItr(l1).toArray()));
    }
}
