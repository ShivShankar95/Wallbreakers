class Solution {
    public int binaryGap(int N) {
        
        int lastOneBit = -1;
        int binaryGap = 0; 
        
        
        for(int i = 0;i < 32;i++){
            if(((N>>i) & 1) != 0) {
                binaryGap = Math.max(binaryGap, i - lastOneBit);
                lastOneBit = i;
            }
        }
        
        return binaryGap;
    
       
    }
}
