class Solution {
    Integer[] dp = new Integer[1001];
    public int combinationSum4(int[] nums, int target) {
       
        memo(nums,target);
        return dp[target];
    }
    public int memo(int[] nums,int target){
        
         
        
        if(target == 0){
            return 1;
        }
        if(target < 0){
            return 0;
        }
        if(dp[target] != null){
            return dp[target];
        }
        
        int ans = 0;
        for(int i=0; i < nums.length; i++){
            if(target - nums[i] >= 0)
            ans += memo(nums,target - nums[i]);
        }
        dp[target] = ans;
        return dp[target];

    }
    public void recHelper(int[] nums,int target, int cnt){
        if(target == 0){
            cnt++;
            System.out.println("");
            return;
        }
        int sum = 0 + cnt;
        for(int i=0; i < nums.length; i++){
            if(nums[i] <= target){
                int newTar = target - nums[i];
                 recHelper(nums,newTar,cnt);
            }
             
        }
        
        return;
    }
}