class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE, sum =0;
        for(int num : nums){
            sum += num;
            if(sum > max_sum){
                max_sum = sum;
            }
            if(sum < 0){
                sum =0;
            }
        }
        return max_sum;
    }
}