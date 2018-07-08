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
    public static void rotateSquareImageCCW(int[][] matrix) {
        if(matrix.length <= 1) return;
        for(int i=0;i<matrix.length;i++) {
            for(int j=i;j<matrix.length;j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for(int i=0;i<matrix.length/2;i++) {
            for(int j=0;j<matrix.length;j++) {
                int tmp = matrix[matrix.length-i-1][j];
                matrix[matrix.length-i-1][j] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotateSquareImageCCW(matrix);
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
