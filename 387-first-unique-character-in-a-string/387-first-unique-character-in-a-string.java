class Solution {
    public int firstUniqChar(String s) {
        int ans = s.length();
        int[] freq = new int[26];
        for(int i = s.length()-1; i >= 0 ; i--){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            
        }
        for(int i = 0; i <s.length() ; i++){
            char ch = s.charAt(i);
            if(freq[ch - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}