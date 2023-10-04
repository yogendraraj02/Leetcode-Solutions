class Solution {
    public int[] shuffle(int[] nums, int n) {
        //storing value as a pair (combined two values into one)
        
        for(int i=0 ; i < n ; i++){
            nums[i] += nums[i+n] * 10000; // taking a maximum 
        }
        for(int i = n-1; i >= 0; i--){
            nums[i * 2 + 1] = nums[i] / 10000;
            nums[i * 2] = nums[i] % 10000;
        }
        
        return nums;
    }
}