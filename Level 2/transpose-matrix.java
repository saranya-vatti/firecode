// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void transposeMatrix(int[][] matrix) {
    for(int i=0;i<matrix.length;i++) {
        for(int j=i;j<matrix[i].length;j++) {
            int tmp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i]=tmp;
        }
    }
}