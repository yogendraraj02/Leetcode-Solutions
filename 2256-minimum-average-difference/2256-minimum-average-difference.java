class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;  
        long min = Integer.MAX_VALUE, sum = 0, lsum = 0, rsum = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < n; i++) {
            lsum += nums[i];
            rsum = sum - lsum;
            long diff = Math.abs(lsum/(i + 1) - (n - i == 1 ? 0 : rsum / (n - i - 1)));                           if (diff < min) {
                 min = diff;
                 ans = i;
            }
        }
        return ans;

    }
}