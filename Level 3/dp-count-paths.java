// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public int countPaths(int m, int n){
    int[][] dp = new int[m+1][n+1];
    for(int i=0;i<=m;i++) {
        for(int j=0;j<=n;j++) {
            if(i==0 || j==0) {
                dp[i][j] = 0;
            } else if(i==1 || j==1) {
                dp[i][j] = 1;
            } else {
                dp[i][j] = -1;
            }
        }
    }
    return rec(dp, m, n);
}
private int rec(int[][] dp, int m, int n) {
    if(dp[m][n] != -1) return dp[m][n];
    dp[m][n] = rec(dp, m-1, n) + rec(dp, m, n-1);
    return dp[m][n];
}