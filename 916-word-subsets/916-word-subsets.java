class Solution {
    public int getSize(int[] freq){
        int cnt = 0;
        for(int i=0; i < 26;i++){
            if(freq[i] >= 1) cnt++;
        }
        return cnt;
    }
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        int[] mainfreq = new int[26];
        List<String> universal = new ArrayList<>();
        
        for(String word : words2){
            int[] temp = new int[26];
            for(char wc : word.toCharArray()){
                //temp.put(wc , temp.getOrDefault(wc,0)+1);
                temp[wc - 'a']++;
                if(mainfreq[wc-'a'] > 0){
                    if(mainfreq[wc-'a'] < temp[wc-'a'] ){
                        mainfreq[wc -'a'] = temp[wc-'a'];
                    }
                } else{
                    mainfreq[wc-'a'] = 1;
                }
            }
        }    
        
        for(String word : words1){
            int freq[] = new int[26];
            for(char ch : word.toCharArray()){
                freq[ch - 'a']++;
            }
            if(isSubset(freq , mainfreq)){
                universal.add(word);
            }
            
        }
        
        return universal;
    }
    public boolean isSubset(int[] word,int[] set){
        for(int i=0; i < 26;i++){
            if(set[i] > word[i]) return false;  //that is mainfreq should be less or equal  
        }
        return true;
    }
}