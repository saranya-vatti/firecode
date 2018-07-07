/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static ArrayList<String> printPaths(char[][] board){
        int m = board.length;
        int n = board[0].length;
        if(m==0 || n==0) return new ArrayList<String>();
        ArrayList<String>[][] dp = new ArrayList[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                dp[i][j] = new ArrayList<String>();
            }
        }
        
        for(int i=m-1;i>=0;i--) {
            for(int j=n-1;j>=0;j--) {
                String curr = Character.toString(board[i][j]);
                if(i==m-1 && j==n-1) {
                    dp[i][j].add(curr);
                } 
                if (j != n-1) {
                    ArrayList<String> nextList = dp[i][j+1];
                    for(int k=0;k<nextList.size();k++) {
                        dp[i][j].add(curr.concat(nextList.get(k)));
                    }
                }
                if (i != m-1) {
                    ArrayList<String> nextList = dp[i+1][j];
                    for(int k=0;k<nextList.size();k++) {
                        dp[i][j].add(curr.concat(nextList.get(k)));
                    }
                }
            }
        }
        /*for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(Arrays.toString(dp[i][j].toArray()));
            }
            System.out.println();
        }*/
        return dp[0][0];
    }
	public static void main(String[] args) {
	    char[][] board = {{}};
		System.out.println(Arrays.toString(printPaths(board).toArray()));
	}
}
