class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m+1][n+1][maxMove+1];
        for(int[][] ele : dp){
            for(int e[] : ele) Arrays.fill(e, -1);
        }
        return findPathsHelper(startRow,startColumn , m,n,maxMove , dp);
    }
    private int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    private int mod = (int)1e9+7;
    
    public int findPathsHelper(int sr,int sc ,int rows,int cols,int moves,int[][][] dp){
        if( sr < 0 || sc < 0 || sr >= rows || sc >= cols ) return 1;
        
        if(moves <= 0) return 0;
        if(dp[sr][sc][moves] != -1) return dp[sr][sc][moves];
        
        int ans = 0;
        
        for(int d[] : dir){
            int r = sr + d[0];
            int c = sc + d[1];
            
            ans = (ans + findPathsHelper(r,c,rows,cols, moves-1, dp))%mod;
        }
        return dp[sr][sc][moves] = ans;
        
    }
}