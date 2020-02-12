class Solution {
    
    public String reverseWord(String s){
        
        StringBuilder reversedWord = new StringBuilder();
        reversedWord = reversedWord.append(s);
        return  reversedWord.reverse().toString();
        
    }
    
    public String reverseWords(String s) {
        
        String[] splitString = s.split("\\s+");
        String reversedString = new String();
        
        for(int i = 0;i<splitString.length;i++){
            splitString[i] = reverseWord(splitString[i]);
        }
        
        for(int i = 0;i<splitString.length;i++){
            if(i > 0 ){
                reversedString += ' ';
            }
            reversedString += splitString[i];
        }
        
        
        return reversedString;
        
        
    }
}
