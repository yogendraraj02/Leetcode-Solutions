class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        map<int,int> mp;
        for(int x : arr){
            mp[x]++;
        }
        vector<int> freq;
        for(auto it = mp.begin();it!= mp.end();it++){
           freq.push_back(it->second);
        }
        sort(freq.begin(),freq.end());
        for(int i=0; i < freq.size()-1;i++){
            if(freq[i]== freq[i+1]){
                return false;
            }
        }
        return true;
    }
};