class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0, countOnes=0 , maxOnes = 0;
        
        for(int i=0; i < nums.length ; i++){
            
            if(nums[i] == 1) countOnes++;
            
            int replaceRequired = i - start + 1 - countOnes;
            if(replaceRequired > k){
                if(nums[start] == 1){
                    countOnes--;
                }
                start++;
            }
            
            maxOnes = Math.max(maxOnes , i - start  +1);
        }
        return maxOnes;
    }
}