class Solution {
    public int equalPairs(int[][] grid) {
        //row-row
        int n = grid.length , m = grid[0].length,cnt = 0;
        
        //row-col
        for(int row =0; row < n ; row++){
            
            
            for(int col = 0;col < n;col++){
                int flag = 1;
                for(int j =0; j < n;j++){
                    if(grid[row][j] != grid[j][col]){
                        flag = 0;
                        break;
                    }
                }
                 if(flag == 1){
                     //System.out.println("matched r:"+row+" col:"+col);
                    cnt++;
                }
            }
           
        }
        return cnt;
    }
}