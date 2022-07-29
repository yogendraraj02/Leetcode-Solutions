class Solution {
    
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        
        List<String> ans = new ArrayList<>();
        
        for(String word : words){
            if(isValidPattern(pattern , word)){
                ans.add(word);
            }
        }
        
        return ans;
    }
    public boolean isValidPattern(String pattern,String word){
        
        for(int i=0;  i < pattern.length() ; i++){
            char pc = pattern.charAt(i);
            char wc = word.charAt(i);
            if(pattern.indexOf(pc) != word.indexOf(wc)) return false;
        }
        return true;
    }
}