#include<bits/stdc++.h>
class Solution {
public:
    static bool comp(vector<pair<int,char>> a,vector<pair<int,char>> b){
        return a[0].first >= b[0].first;
    }
    string frequencySort(string s) {
        
       map<char,int> mp;
        for(char ch : s){
            mp[ch]++;
        }
        string ans="";
        
        vector<pair<int,char>> vp;
        
        
        for(auto it=mp.begin();it!=mp.end();it++){
            vp.push_back({it->second,it->first});
        }
        sort(vp.begin(),vp.end());
        for(int i=vp.size()-1;i>=0;i--){
            while(vp[i].first-- > 0)
                ans += vp[i].second;
        }
        return ans;
    }
};