class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return getPaths(0,0,m-1,n-1,dp);
        
    }
    public int getPaths(int i ,int j ,int m,int n,int[][]dp){
        if(i > m || j > n )  return 0;  
        if(dp[i][j] !=0)    return dp[i][j];
        if(i == m && j == n){
            return 1;
        }
        
        dp[i][j] = getPaths(i+1,j,m,n,dp) + getPaths(i,j+1,m,n,dp);
        return dp[i][j];
    }
}