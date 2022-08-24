class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        return lcsmemo(text1,text2 , dp);
    }
    
    public int lcsmemo(String s, String t,int[][] dp){
        
        int m = s.length();
        int n = t.length();
        if(dp[m][n] != 0){
            return dp[m][n];
        }
        if(m == 0 || n == 0){
            dp[m][n] = 0;
            return dp[m][n];
        }
        if(s.charAt(0) == t.charAt(0)){
            dp[m][n] = 1 + lcsmemo(s.substring(1),t.substring(1),dp);
        
        } else {
            int op1 = lcsmemo(s , t.substring(1),dp);
            int op2 = lcsmemo(s.substring(1), t, dp);
            dp[m][n] = Math.max(op1 , op2);
        }
        return dp[m][n];
    }
}