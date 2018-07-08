// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ArrayList<ArrayList<Integer>> printLevelByLevel(TreeNode root) {
    ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
    if(root==null) return lists;
    Queue<TreeNode> qu= new LinkedList<TreeNode>();
    qu.add(root);
    while(!qu.isEmpty()) {
        ArrayList<Integer> list = new ArrayList<Integer>();
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
        lists.add(list);
    }
    return lists;
}