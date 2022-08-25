class Solution {
    public boolean canConstruct(String r, String m) {
        
        
        int[] freq = new int[26];
        
        for(char ch : r.toCharArray()){
            freq[ch - 'a']++;
        }
        for(char ch : m.toCharArray()){
            freq[ch -'a']--;
        }
        for(char ch : r.toCharArray()){
            if(freq[ch - 'a'] >= 1){
                return false;
            }
        }
        
        return true;
    }
}