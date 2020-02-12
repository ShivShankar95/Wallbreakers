class Solution {
    public int hammingDistance(int x, int y) {
        
        int hammingDistance = 0;   
        if(x == y) 
            return 0;
        for(int i = 0; i < 32; i ++){     
            hammingDistance += ( (x&1) == (y&1))? 0 : 1;   
            x = x >> 1;  
            y = y >> 1;
        }
        
        return hammingDistance;
    }
        
    }
