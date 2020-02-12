class Solution {
    public boolean isPalindrome(String s) {
        
        String alphaNumericString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int i = 0;
        int j = alphaNumericString.length() - 1;
        while(i < j){
            if(alphaNumericString.charAt(i) != alphaNumericString.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
        
       
    }
}
