class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int ws = 0;
        long ans = 0L;
        
        long ones = 0L;
        
        
        ArrayList<Long> arr = new ArrayList<>();
        for(int i=0; i < nums.length ; i++){
            if(nums[i] !=0){
                if(ans !=0)
                    arr.add(ans);
                ans = 0;
                ws = i+1;
                continue;
            }
            ans = Math.max(ans,i -ws + 1);
            
        }
        if(ans != 0){
            arr.add(ans);
        }
       
        
        for(Long val : arr){
            
           ones += 1L*(val+1) * (val)/2;
        }
        //System.out.println("len:"+arr.size());
        return ones;
    }
}