class Solution {
    public int majorityElement(int[] nums) {
        int candidate = -1;
        int count = 0;
        for(int ele : nums){
            if(count == 0){
                candidate = ele;
                count = 1;
            } else{
                if(ele == candidate){
                    count++;
                } else {
                    count--;
                }
            }
        }
        return candidate;
    }
}