class Solution {
    public boolean isSafe(int[][] grid, int i ,int j){
        int n = grid.length;
        int m = grid[0].length;
        if(i >= 0 && i < n && j >= 0 && j < m && grid[i][j] == 1){
            return true;
        }
        return false;
    }
    public int dfs(int[][]grid ,int i,int j){
        if(isSafe(grid,i,j) == false)
            return 0;
        grid[i][j] = 0;
        int l = dfs(grid , i , j-1) ;
        int r = dfs(grid , i , j+1) ;
        int t = dfs(grid , i-1 , j) ;
        int b = dfs(grid , i+1 , j) ;
        //grid[i][j] = 1;
        return l + r  + t + b  +1;    
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans  = -1;
        for(int i=0; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                ans = Math.max(ans , dfs(grid,i,j));
            }
        }
        return ans;
    }
}