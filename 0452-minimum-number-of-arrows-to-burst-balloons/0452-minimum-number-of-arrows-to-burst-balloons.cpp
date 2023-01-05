class Solution {
public:
    int findMinArrowShots(vector<vector<int>>& points) {
        //merge
        sort(points.begin() , points.end());
        pair<int,int> prev;
        int cnt = 1;
        for(int i=0; i < points.size() ; i++){
            vector<int> curr = points[i];
            if(i == 0){
                prev = make_pair(curr[0],curr[1]);
            } else {
                if(prev.second < curr[0]){
                    //independent
                    prev = {curr[0],curr[1]};
                    cnt++;
                } else {
                    //merge
                    prev = {max(prev.first, curr[0]) , min(prev.second,curr[1])};
                }
            }
            
        }
        return cnt;
        
    }
};
