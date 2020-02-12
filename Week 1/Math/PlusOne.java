class Solution {
    public int[] plusOne(int[] digits) {
        
        int[] plusOne = new int[digits.length];
        
        int n = digits.length - 1;
        int carry = 1;
        
        while(n >= 0) {
            
            if(digits[n]  == 9 && carry == 1) {
                
                plusOne[n] = 0;
                carry = 1;
            }
            else {
                
                plusOne[n] = digits[n] + carry;
                carry = 0;
                //break;
            }
            n--;
        }
        
        if(carry  == 1) {
            
            plusOne = Arrays.copyOf(plusOne, plusOne.length+1);
            for(int i=0;i<digits.length;i++){
                plusOne[i+1] = plusOne[i];
            } 
            
            plusOne[0] = 1;
        }
        return plusOne;
       
    }
}
