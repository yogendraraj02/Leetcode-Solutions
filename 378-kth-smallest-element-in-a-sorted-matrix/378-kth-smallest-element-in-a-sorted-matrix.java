class Solution {
    public int kthSmallest(int[][] matrix, int k) {
     int n = matrix.length, lo = matrix[0][0], hi = matrix[n - 1][n - 1];
        
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            int count = countNonBigger(mid, matrix);
            if (count < k) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        
        return lo;
    }
    
    private static int countNonBigger(int target, int[][] matrix) {
        int n = matrix.length;
        int i = n - 1, j = 0, cnt = 0;
        
        while (i >= 0 && j < n) {
            if (matrix[i][j] > target) {
                i--;
            } else {
                cnt += i + 1;
                j++;
            }
        }
        
        return cnt;
    }
}