class Solution {
    public int characterReplacement(String s, int k) {
       // HashMap<Character,Integer> map = new HashMap<>();
        int mostFreqLetter = 0 ,max =0 , wstart = 0;
        int[] freq = new int[26];
        for(int i=0; i < s.length() ; i++){
            char right = s.charAt(i);
            freq[right - 'A']++;
            
            mostFreqLetter = Math.max(mostFreqLetter,freq[right-'A']);
            
            int lettersToChange = i - wstart + 1 - mostFreqLetter;
            
            if(lettersToChange > k){ // invalid string
                char left = s.charAt(wstart);
                freq[left -'A']--;
                wstart++;
            }
            max = Math.max(i - wstart + 1, max);
        }
        
        return max;
    }
}