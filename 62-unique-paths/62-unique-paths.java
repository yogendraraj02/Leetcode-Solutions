class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        //return getPathsMemo(0,0,m-1,n-1,dp);
        return getPathsTab(dp , m,n);
    }
    public int getPathsMemo(int i ,int j ,int m,int n,int[][]dp){
        if(i > m || j > n )  return 0;  
        if(dp[i][j] !=0)    return dp[i][j];
        if(i == m && j == n){
            return 1;
        }
                
        dp[i][j] = getPathsMemo(i+1,j,m,n,dp) + getPathsMemo(i,j+1,m,n,dp);
        return dp[i][j];
    }
    public int getPathsTab(int[][]dp,int m,int n){
        
        //fill the dp in bottom row (everyone will be one)
        for(int i = m - 1, j = 0; j < n; j++){
            dp[i][j] = 1;
        }
        //fill the dp in last col (everyone will be one)
        for(int i = 0, j =  n -1; i < m ; i++){
            dp[i][j] = 1;
        }
        // now the remaining 
        //formula = dp[i][j] = dp[i+1][j] + dp[i][j+1];
        for(int i = m - 2; i >= 0 ; i--){
            
            for(int j = n - 2 ; j >= 0 ; j--){
                dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
            }
        }
        return dp[0][0];
        
    }
    
}