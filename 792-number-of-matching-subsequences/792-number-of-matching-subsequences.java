class Solution {

   
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<String,Integer> hmap = new HashMap<>();

        int matching = 0;
        
        for(String word : words){
            hmap.put(word , hmap.getOrDefault(word,0)+1);
        }
        char[] ch = s.toCharArray();
        
        for(String word : hmap.keySet()){
            char[] temp = word.toCharArray();
            
            int si = 0;
            int ti = 0;
            while(si < ch.length && ti < temp.length){
                if(ch[si] == temp[ti]){
                    si++;
                    ti++;
                }else{
                    si++;
                }
            }
            if(ti == temp.length){
                matching += hmap.get(word);
            }
        } 
        
        return matching;
    }
}