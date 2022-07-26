class Solution {
    public String minWindow(String s, String p) {
        
        HashMap<Character,Integer> pattern = new HashMap<>();
       
        int ws = 0;
        String ans = "";
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
            
            while(matched == pattern.size()){
                
                if(i - ws +1 < ans.length()){
                        ans = s.substring(ws,i+1);
                } else if(ans.length() == 0){
                    ans = s.substring(ws,i+1);
                }
                char left = s.charAt(ws);
                if(pattern.containsKey(left)){
                    if(pattern.get(left) ==0){
                        matched--;
                    }
                    pattern.put(left,pattern.get(left)+1);
                }
                
                ws++;
            }
            
        }
        
        return ans;
        
    }    
    
}