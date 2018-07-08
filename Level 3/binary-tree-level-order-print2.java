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
   public static ArrayList<Integer> levelorder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root==null) return list;
        Queue<TreeNode> qu= new LinkedList<TreeNode>();
        qu.add(root);
        while(!qu.isEmpty()) {
            Queue<TreeNode> childQueue = new LinkedList<TreeNode>();
            while(!qu.isEmpty()) {
                TreeNode curr = qu.remove();
                list.add(curr.data);
                if(curr.left != null) {
                    childQueue.add(curr.left);
                }
                if(curr.right != null) {
                    childQueue.add(curr.right);
                }
            }
            qu = childQueue;
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
        System.out.println(Arrays.toString(levelorder(l1).toArray()));
    }
}
