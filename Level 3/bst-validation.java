/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/
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
    public static boolean validateBST(TreeNode root) {
        if(root == null) return true;
        if(root.left != null && (root.left.data > root.data || max(root.left) > root.data)) return false;
        if(root.right != null && (root.right.data < root.data || root.data > min(root.right))) return false;
        return validateBST(root.left) && validateBST(root.right);
    }
    public static int max(TreeNode root) {
        while(root.right!=null) root = root.right;
        return root.data;
    }
    public static int min(TreeNode root) {
        while(root.left!=null) root = root.left;
        return root.data;
    }
    public static void main(String[] args) {
        TreeNode l1 = new TreeNode(20);
        TreeNode l2 = new TreeNode(15);
        TreeNode l3 = new TreeNode(40);
        TreeNode l4 = new TreeNode(10);
        TreeNode l5 = new TreeNode(30);
        TreeNode l6 = new TreeNode(6);
        TreeNode l7 = new TreeNode(7);
        l1.left = l2; l1.right = l3;
        l2.left = l4; l2.right = l5;
        //l3.left = l6; l3.right = l7;
        System.out.println(validateBST(l1));
    }
}
