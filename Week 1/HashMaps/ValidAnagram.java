class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }
        
        int[] alphaBetCounter = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            alphaBetCounter[s.charAt(i) - 'a']++;
            alphaBetCounter[t.charAt(i) - 'a']--;
        }
        
        for(int count:alphaBetCounter) {
            if(count > 0){
                return false;
            }
        }
        return true;
        
    }
}
