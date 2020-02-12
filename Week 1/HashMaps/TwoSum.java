class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numberMap = new HashMap<>();
        
        for(int i = 0; i < nums.length;i++){
            numberMap.put(nums[i],i);
        }
        
        for(int i = 0; i < nums.length;i++) {
            int complementNumber = target - nums[i];
            if(numberMap.containsKey(complementNumber) && numberMap.get(complementNumber) != i) {
                 return new int[] { i, numberMap.get(complementNumber) };
            }  
        }
        return new int[] {-1, -1};
        
    }
}
