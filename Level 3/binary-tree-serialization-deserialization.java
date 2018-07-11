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
    public static String serializeTree(TreeNode root){
        if(root==null) return "*";
        String str = "";
        Queue<TreeNode> qu= new LinkedList<TreeNode>();
        qu.add(root);
        while(!qu.isEmpty()) {
            Queue<TreeNode> childQueue = new LinkedList<TreeNode>();
            while(!qu.isEmpty()) {
                TreeNode curr = qu.remove();
                if(!str.equals("")) {
                    str = str.concat(",");
                }
                if(curr == null) {
                    str = str.concat("*");
                } else {
                    str = str.concat(Integer.toString(curr.data));
                    childQueue.add(curr.left);
                    childQueue.add(curr.right);
                }
            }
            qu = childQueue;
        }
        return str;
    }
    
    public static TreeNode restoreTree(String str){
        if(str.equals("") || str.equals("*")) return null;
        String[] arr = str.split(",");
        int[] dataArr = new int[arr.length];
        for(int i=0;i<dataArr.length;i++) {
            if(arr[i].equals("*")) {
                dataArr[i]=-1;
            } else {
                dataArr[i]=Integer.parseInt(arr[i]);
            }
        }
        TreeNode root = new TreeNode(dataArr[0], null, null);
        populate(root, 0, 1, dataArr);
        return root;
    }
    private static void populate(TreeNode curr, int level, int index, int[] dataArr) {
        int newLevel = level + 1;
        int lIndex = ((index - 1) * 2) + 1;
        int rIndex = lIndex + 1;
        int lIndexWhole = power(newLevel) + lIndex - 2;
        int rIndexWhole = power(newLevel) + rIndex - 2;
        if(lIndexWhole >= dataArr.length) return;
        if(dataArr[lIndexWhole] != -1) {
            curr.left = new TreeNode(dataArr[lIndexWhole], null, null);
            populate(curr.left, newLevel, lIndex, dataArr);
        }
        if(rIndexWhole >= dataArr.length) return;
        if(dataArr[rIndexWhole] != -1) {
            curr.right = new TreeNode(dataArr[rIndexWhole], null, null);
            populate(curr.right, newLevel, rIndex, dataArr);
        }
    }
    private static int power(int n) {
        int num = 1;
        while(n-->0) {
            num = num*2;
        }
        return num;
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
        l2.left = null; l2.right = null;
        l3.left = l6; l3.right = l7;
        System.out.println(serializeTree(restoreTree(serializeTree(l1))));
    }
}
