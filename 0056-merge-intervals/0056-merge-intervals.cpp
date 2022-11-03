class Solution {
public:
 
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        
        sort(intervals.begin(),intervals.end());
        
        vector<vector<int>> ans;
        
        for(int i=0; i < intervals.size();i++){
            
            vector<int> curr = intervals[i];
            int maxOfY = intervals[i][1];
            while(i+1 < intervals.size() && intervals[i+1][0] <= maxOfY){
                maxOfY = max(maxOfY , intervals[i+1][1]);
                i++;
            }
            ans.push_back({curr[0],maxOfY});
        }
        
        return ans;
    }
    
};