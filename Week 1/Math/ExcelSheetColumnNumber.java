class Solution {
    public int titleToNumber(String s) {
        
        int number = 0;
        for(int i = 0; i < s.length();i++) {
            number = number * 26 + (int)s.charAt(i) - 64;
        }
        
        return number;
        
    }
}
