class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        while(s < e){
            if((nums[s] & 1) == 1 && (nums[e] & 1) == 0){
                swap(nums,s,e);
                s++;
                e--;
            }
            if((nums[s] & 1) == 0){
                s++;
            }
            if((nums[e] & 1) == 1){
                e--;
            }
        }
        return nums;
    }
    public void swap(int[] arr ,int i ,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}