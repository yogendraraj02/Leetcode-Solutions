class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length , n = matrix[0].length , t = target;
       
        int r = 0, c = n-1;
        while(r < m && c >= 0){
           
            if(matrix[r][c] ==t){
                return true;
            } else if(matrix[r][c] > t){
                c--; 
            } else{
                r++;
            }
            
        }
        return false;
    }
}