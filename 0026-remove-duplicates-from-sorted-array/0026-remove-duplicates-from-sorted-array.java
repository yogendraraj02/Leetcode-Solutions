class Solution {
    public void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int removeDuplicates(int[] nums) {
        
        // two cases either kth ith equal or not equal..
        int k = 0;
        for(int i = 1; i < nums.length ; i++){
            if(nums[k] != nums[i]){
                swap(nums, k+1 , i);
                k++;
            }
        }

        return k + 1;
    }
}