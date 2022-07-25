class Solution {
    public int firstOcc(int[] nums,int tar){
        int s =0,e = nums.length-1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] == tar){
                ans = mid;
                e = mid-1;
            } else if(nums[mid] > tar){
                e = mid-1;
            } else{
                s = mid+1;
            }
        }
        return ans;
    }
    public int secOcc(int[] nums,int tar){
        int s =0,e = nums.length-1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] == tar){
                ans = mid;
                s = mid+1;
            } else if(nums[mid] > tar){
                e = mid-1;
            } else{
                s = mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = firstOcc(nums,target);
        ans[1] = secOcc(nums,target);
        return ans;
    }
}