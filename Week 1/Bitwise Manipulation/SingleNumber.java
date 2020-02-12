class Solution {
    public int singleNumber(int[] nums) {
        int missingNumber  = 0;
        
        for(int i:nums) {
            missingNumber = missingNumber ^ i;
            
        }
        
        return missingNumber;
        
    }
}
