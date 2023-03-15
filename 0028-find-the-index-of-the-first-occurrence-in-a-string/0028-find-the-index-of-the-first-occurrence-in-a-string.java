class Solution {
    
    public int strStr(String h, String n) {
        
        for(int i=0 ; i <= h.length() - n.length() ; i++){
            int j =0;
            while(j < n.length() && h.charAt(i+j) == n.charAt(j)){
                j++;
                if(j == n.length()){
                    return i;
                }
            }

        }
        return -1;
    }
     
}