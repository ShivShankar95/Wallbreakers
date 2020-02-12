class Solution {
    
    public int charCodeAt(char c){
        return (int)c;
    }
    public boolean detectCapitalUse(String word) {
        
        boolean hasLowerLetter = false;
        
        
        
        for(int i = 0;i < word.length();i++){
            
            if(charCodeAt(word.charAt(i)) >= 65 && charCodeAt(word.charAt(i)) <= 90) {
                if(hasLowerLetter){
                    return false;
                }
             }
            else {
                
                if(!hasLowerLetter && i >= 2) {
                    return false;
                } 
                else {
                    hasLowerLetter = true;
                    
                }
                
            }
            
        }
        
        return true;
        
        
    }
}
