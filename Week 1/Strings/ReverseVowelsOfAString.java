class Solution {
    public String reverseVowels(String s) {
        
        char[] charArray = s.toCharArray();
        char temp = ' ';
        
        int l = 0;
        int r = s.length() - 1;
        
        while(l < r) {
            
            if(!isVowel(charArray[l])) {
                l++;
                continue;
            }
            if(!isVowel(charArray[r])) {
                r--;
                continue;
            }
               
               temp = charArray[l];
               charArray[l] = charArray[r];
               charArray[r] = temp;
               
               l++;
               r--;
        }
        
        return new String(charArray);
        
    }
    
    private boolean isVowel(char c){
        
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'  ||
           c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
}
