class Solution {
    public char repeatedCharacter(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
            if(freq[ch-'a']==2){
                return ch;
            } 
        }
        return s.charAt(0);
    }
}