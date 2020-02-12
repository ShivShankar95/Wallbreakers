class Solution {
    public int[][] transpose(int[][] A) {
        
        int rowLength = A.length, columnLength = A[0].length;
        int[][] transposeMatrix = new int[columnLength][rowLength];
        for (int r = 0; r < rowLength; r++)
            for (int c = 0; c < columnLength; c++) {
                transposeMatrix[c][r] = A[r][c];
            }
        return transposeMatrix;
        
    }
}
