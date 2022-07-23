class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ws = 0;
        int longest_str = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int we = 0 ; we < s.length() ;we++){
            char rightC = s.charAt(we);
            
            if(map.containsKey(rightC)){
                ws = Math.max(ws , map.get(rightC)+1);
            }
            
            map.put(rightC , we);
            
            longest_str = Math.max(longest_str , we - ws + 1); 
        }
        return longest_str;
    }
}