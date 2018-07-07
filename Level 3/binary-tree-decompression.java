// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public TreeNode decompressTree(String str){
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
private void populate(TreeNode curr, int level, int index, int[] dataArr) {
    int newLevel = level + 1;
    int lIndex = ((index - 1) * 2) + 1;
    int rIndex = lIndex + 1;
    int lIndexWhole = power(newLevel) + lIndex - 2;
    int rIndexWhole = power(newLevel) + rIndex - 2;
    if(lIndexWhole >= dataArr.length) return;
    curr.left = new TreeNode(dataArr[lIndexWhole], null, null);
    if(rIndexWhole >= dataArr.length) return;
    curr.right = new TreeNode(dataArr[rIndexWhole], null, null);
    populate(curr.left, newLevel, lIndex, dataArr);
    populate(curr.right, newLevel, rIndex, dataArr);
}
private int power(int n) {
    int num = 1;
    while(n-->0) {
        num = num*2;
    }
    return num;
}