class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         HashMap<Character,Integer> pattern = new HashMap<>();
        // HashMap<Character,Integer> perm = new HashMap<>();
        List<Integer> anagrams = new ArrayList<>();
        int ws = 0;
        
        for(char ch : p.toCharArray()){
            pattern.put(ch,pattern.getOrDefault(ch,0)+1);
        }
        int matched = 0;
        for(int i=0; i < s.length() ; i++){
            
            char right = s.charAt(i);
            if(pattern.containsKey(right)){
                pattern.put(right , pattern.getOrDefault(right,0)-1);
                if(pattern.get(right)==0)
                    matched++;
            }
            
            if(matched == pattern.size()){
                //return true;
                anagrams.add(ws);
            }
            if(i >=  p.length()-1){
                char left = s.charAt(ws);
                if(pattern.containsKey(left)){
                    if(pattern.get(left)==0){
                        matched--;
                    }
                    pattern.put(left, pattern.get(left)+1);
                }
                ws++;
            }
        }
        
        return anagrams;
        
    }    
    
}