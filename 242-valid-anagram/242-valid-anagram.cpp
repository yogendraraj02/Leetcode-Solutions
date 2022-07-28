class Solution {
public:
    bool isAnagram(string s, string t) {
        map<char,int> match;
        for(auto ch : s){
            match[ch]++;
        }
        for(auto ch : t){
            match[ch]--;
            if(match[ch] < 0){
                return false;
            }
        }
        for(auto m : match){
            if(m.second !=0){
                return false;
            }
        }
        return true;
    }
};