class Solution {
    
    
    public int[] sortArrayByParity(int[] A) {
        
        int[] paritySorted = new int[A.length];
        int insertionIndex = 0;
        
        for(int i = 0;i < A.length;i++) {
            if(A[i] % 2 == 0) {
                paritySorted[insertionIndex++] = A[i];
            }
        }
        
        for(int i = 0;i < A.length;i++) {
            if(A[i] % 2 == 1) {
                paritySorted[insertionIndex++] = A[i];
            }
        }
    
        
        return paritySorted;
        
        
    }
}
