class Solution {
public:
    bool closeStrings(string word1, string word2) {
        
        if(word1.length() != word2.length()) return false;
        
        int freq1[26];
        int freq2[26];
        for(int i=0; i < 26;i++){
            freq1[i] = 0;
            freq2[i] = 0;
        }
        for(int i=0; i < word1.size();i++){
            char ch = word1[i];
            int idx = ch - 'a';
            freq1[idx]++;
        }
         for(int i=0; i < word2.size();i++){
            char ch = word2[i];
            int idx = ch - 'a';
            freq2[idx]++;
        }
        for(int i=0; i < 26;i++){
            if(freq1[i] == 0){
                if(freq2[i]!=0){
                    return false;
                }
            } else {
                if(freq2[i] == 0){
                    return false;
                }
            }
        }
        
        map<int,int> mp1;
        map<int,int> mp2;
        for(int i=0; i < 26;i++){
            if(freq1[i]!=0){
                mp1[freq1[i]]++;
            }
        }
        for(int i=0; i < 26;i++){
            if(freq2[i]!=0){
                mp2[freq2[i]]++;
            }
        }
        for(auto it=mp1.begin();it!=mp1.end();it++){
            if(it->second != mp2[it->first]){
                return false;
            }
        }
        return true;
    }
};