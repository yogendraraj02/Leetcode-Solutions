class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        // int ans =  lcsmemo(text1,text2 , dp);
        //int[text1.length() + 1][text2.length() + 1];
        int ans =  lcsDP(text1,text2 , dp);
        // for(int[] row : dp){
        //     for(int val : row){
        //         System.out.print(val +" ");
        //     }
        //     System.out.println();
        // }
        return ans;
    }
     public int lcsDP(String s, String t,int[][] dp){
        
        int m = s.length();
        int n = t.length();
        if(m == 0 || n == 0){
            return dp[m][n];
        }
        for(int i = 0; i <= m ; i++){
            for(int j = 0; j <= n ;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                } else{
                    char ch1 = s.charAt(i-1);
                    char ch2 = t.charAt(j -1);
                   
                    if(ch1 == ch2){
                        dp[i][j] = 1 + dp[i-1][j-1];
                    } else{
                         dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
        }
        return dp[m][n];
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