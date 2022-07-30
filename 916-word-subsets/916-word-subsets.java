class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        List<String> universal = new ArrayList<>();
        
        for(String word : words2){
            HashMap<Character,Integer> temp = new HashMap<>();
            for(char wc : word.toCharArray()){
                temp.put(wc , temp.getOrDefault(wc,0)+1);
                if(hmap.containsKey(wc)){
                    if(hmap.get(wc) < temp.get(wc)){
                        hmap.put(wc,temp.get(wc));
                    }
                } else{
                    hmap.put(wc,1);
                }
            }
        }    
        
        for(String word : words1){
            int match = 0;
            int freq[] = new int[26];
            for(char ch : word.toCharArray()){
                if(hmap.containsKey(ch)){
                    freq[ch - 'a']++;
                    if(freq[ch-'a'] == hmap.get(ch)){
                        match++;
                    }
                }
                if(match == hmap.size()){
                    universal.add(word);
                    break;
                }
            }
            
        }
        
        return universal;
    }
}