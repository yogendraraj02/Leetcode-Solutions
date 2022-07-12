class Solution {
    public String longestCommonPrefix(String[] strs) {
        // if(strs.length == 1){
        //     return strs[0];
        // }
        int idx = 0;
        while(idx < strs[0].length()){
            for(int i=0; i < strs.length-1;i++){
                int n = strs[i].length();
                int n2 = strs[i+1].length(); 
                if(n ==0 || n2 == 0) return "";
                
                if(idx >= n || idx >= n2 || strs[i].charAt(idx)!=strs[i+1].charAt(idx)){
                    return strs[0].substring(0,idx);
                }
                
            }
            idx++;
        }
        //System.out.println("end:");
        return strs[0];
    }
}