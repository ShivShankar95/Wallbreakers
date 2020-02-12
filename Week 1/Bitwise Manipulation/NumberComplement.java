class Solution {
    public int findComplement(int num) {
        
        String binaryNumber = Integer.toBinaryString(num);
        String numberComplement = new String();
        
        for(int i = 0;i<binaryNumber.length();i++) {
            if(binaryNumber.charAt(i) == '0') {
                numberComplement += '1';
            }
            else {
                numberComplement += '0';
            }
            
        }
        return Integer.parseInt(numberComplement,2);
        
    }
}
