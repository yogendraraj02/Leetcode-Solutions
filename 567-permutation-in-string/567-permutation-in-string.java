class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> pattern = new HashMap<>();
        HashMap<Character,Integer> perm = new HashMap<>();
        
        int ws = 0;
        
        for(char ch : s1.toCharArray()){
            pattern.put(ch,pattern.getOrDefault(ch,0)+1);
        }
        for(int i=0; i < s2.length() ; i++){
            
            char right = s2.charAt(i);
            if(!pattern.containsKey(right)){
                ws = i+1;
                perm = new HashMap<>();
                continue;
            }
            perm.put(right , perm.getOrDefault(right,0)+1);
            
            
            while(ws < i && perm.get(right) > pattern.get(right)){
                char left = s2.charAt(ws);
                perm.put(left , perm.get(left)-1);
                ws++;
            }
            
            // System.out.println("i:"+i+" ws:"+ws);
            
            if(i - ws + 1 == s1.length()){
                System.out.println("i:"+i+" ws:"+ws);
                return true;
            }
        }
        
        return false;
        
    }
}