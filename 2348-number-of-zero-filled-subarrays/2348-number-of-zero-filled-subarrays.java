class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long curr = 0;
        long ans = 0L;
        
        for(int i=0; i < nums.length ; i++){
            if(nums[i]==0){
                curr++;
            } else{
                ans += (1L*curr*(curr+1)/2);
                curr = 0L;
            }
        }
        //System.out.println("len:"+arr.size());
        if(curr!=0){
            ans += (1L*curr*(curr+1)/2);
        }
        return ans;
    }
}