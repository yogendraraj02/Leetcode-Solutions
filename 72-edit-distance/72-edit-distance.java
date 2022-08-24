class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+ 1][word2.length() + 1];
        //return minDistanceRec(word1,word2);
        //return minDistanceMemo(word1,word2,dp);
          return minDistanceDP(word1,word2,dp);
    }
    public int minDistanceDP(String s, String t,int[][] dp) {
        
        int m = s.length();
        int n = t.length();
        for(int i=0; i <= m ; i++){
            dp[i][0] = i;
        }
        for(int j=0; j <= n ; j++){
            dp[0][j] = j;
        }
        for(int i = 1; i <=m ; i++){
            for(int j = 1 ; j<=n ;j++){
                if(s.charAt(i -1) == t.charAt(j - 1)){
                    dp[i][j] = dp[i-1][j-1];
                } else{
                    dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j] , dp[i][j-1])) + 1;
                }
            }
        }
        return dp[m][n];
    }
     public int minDistanceMemo(String s, String t,int[][] dp) {
        int m = s.length();
        int n = t.length();
        if(s.length() == 0){
           dp[m][n] = t.length();
           return t.length(); 
        } 
        if(t.length() == 0){
            dp[m][n] = s.length();
            return s.length();
        } 
        if(dp[m][n] != 0){
            return dp[m][n];
        }
        if(s.charAt(0) == t.charAt(0)){
            dp[m][n] = minDistanceMemo(s.substring(1),t.substring(1) , dp);
            return dp[m][n];
        } else{
            //insert
            int op1 = 1 + minDistanceMemo(s,t.substring(1) , dp);
            //delete
            int op2 = 1 + minDistanceMemo(s.substring(1),t , dp);
            //replace
            int op3 = 1 + minDistanceMemo(s.substring(1),t.substring(1) , dp);
            return dp[m][n] =  Math.min(op1 , Math.min(op2 , op3));
        }
        
    }
    public int minDistanceRec(String s, String t) {
        
        if(s.length() == 0) return t.length();
        if(t.length() == 0) return s.length();
        
        if(s.charAt(0) == t.charAt(0)){
            return minDistanceRec(s.substring(1),t.substring(1));
        } else{
            //insert
            int op1 = 1 + minDistanceRec(s,t.substring(1));
            //delete
            int op2 = 1 + minDistanceRec(s.substring(1),t);
            //replace
            int op3 = 1 + minDistanceRec(s.substring(1),t.substring(1));
            return Math.min(op1 , Math.min(op2 , op3));
        }
        
    }
}