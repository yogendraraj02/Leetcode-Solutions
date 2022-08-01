class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        return getPathsTab(dp,m,n,obstacleGrid);
    }
    public int getPathsTab(int[][]dp,int m,int n,int[][] grid){
        
        if(grid[m-1][n-1] == 1) return 0;
        //fill the dp in bottom row (everyone will be one)
        boolean obs = false;
        for(int i = m - 1, j = n-1; j >=0; j--){
            if(grid[i][j] == 1){
                obs = true;
            }
            if(obs == true){
                dp[i][j] = 0;
            } else{
                dp[i][j] = 1;    
            }
        }
        //fill the dp in last col (everyone will be one)
        obs = false;
        for(int i = m-1, j = n -1; i >= 0 ; i--){
            if(grid[i][j] == 1){
                obs = true;
            }
            if(obs){
                dp[i][j] = 0;
            } else{
                dp[i][j] = 1;    
            }
            
        }
        // now the remaining 
        //formula = dp[i][j] = dp[i+1][j] + dp[i][j+1];
        for(int i = m - 2; i >= 0 ; i--){
            
            for(int j = n - 2 ; j >= 0 ; j--){
                if(grid[i][j] == 1) continue; //block
                dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
            }
        }
        return dp[0][0];
        
    }
}