
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> external = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n-2;i++ ){
           if(i > 0 && nums[i-1] == nums[i]) continue;
           pairSearch(nums,i+1,-nums[i],external);
        }
        return external;
    }
  
    public void pairSearch(int[] nums,int s, int tar,List<List<Integer>> triplets){
       int e = nums.length - 1;
        while(s < e){
            int sum = nums[s] + nums[e];
            if(sum == tar){
                triplets.add(Arrays.asList(-tar,nums[s],nums[e]));
                s++;
                e--;
                while(s < e && nums[s] == nums[s-1]) s++;
                while(s < e && nums[e] == nums[e+1]) e--;
            }
            
            else if(sum < tar){
                s++;
            } else{
                e--;
            }
        }
        
    }
    
}