class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        int rowLength = A.length;
        int colLength = A[0].length;
        int temp = 0;
        
        for(int i = 0;i<rowLength;i++){
            for(int j = 0; j < colLength/2;j++) {
                temp = A[i][colLength - j - 1];
                A[i][colLength - j - 1] = A[i][j];
                A[i][j] = temp;
                
            }
            
            for(int j = 0;j<colLength;j++){
                if(A[i][j] == 0) {
                    A[i][j] = 1;
                }
                else {
                    A[i][j] = 0;
                }
            }
        }
        
        return A;
        
    }
}