class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ws = 0;
        int longest_str = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int we = 0 ; we < s.length() ;we++){
            char curr = s.charAt(we);
            map.put(curr , map.getOrDefault(curr,0)+1);
            
            while(map.get(curr) > 1){
                char left = s.charAt(ws);
                map.put(left , map.get(left)-1);
                if(map.get(left) == 0){
                    map.remove(left);
                }
                ws++;
            }
            longest_str = Math.max(longest_str , we - ws + 1); 
        }
        return longest_str;
    }
}