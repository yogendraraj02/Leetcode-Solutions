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
            int match = 0;
            int freq[] = new int[26];
            for(char ch : word.toCharArray()){
                if(mainfreq[ch-'a'] > 0){
                    freq[ch - 'a']++;
                    if(freq[ch-'a'] == mainfreq[ch-'a']){
                        match++;
                    }
                }
                int size = getSize(mainfreq);
                if(match == size){
                    universal.add(word);
                    break;
                }
            }
            
        }
        
        return universal;
    }
}