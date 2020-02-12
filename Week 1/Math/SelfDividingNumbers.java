class Solution {
    
    public boolean isSelfDividingNumber(int number) {
        int temp = number;
        
        while(temp > 0) {
            int digit = temp%10;
            
            
            
            if(digit == 0 || number % digit != 0) {
                
                return false;
            }
            else {
                temp = temp/10;
            }
        }
       
        
        return true;
        
    }
    
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for(int i = left; i <=right;i++) {
            if(isSelfDividingNumber(i)) {
                
                numbers.add(i);
            }
            
            
        }
        
        return numbers;
        
    }
}
