class Solution {
public:
    bool halvesAreAlike(string s) {
        int n = s.size();
        int freq[n];
        for(int i=0; i < s.size();i++){
            freq[i] = 0;
        }
        
        for(int i=0; i < s.size();i++){
            if(s[i] >= 65 && s[i] <= 90){
                s[i] += 32;
            }
            if(s[i] =='a' || s[i]=='e'  || s[i]=='i'  || s[i]=='o'  || s[i]=='u'){
                if(i > 0)
                    freq[i] = freq[i-1] + 1;
                else
                    freq[0] = 1;
            } else {
                if(i == 0) continue;
                freq[i] = freq[i-1];
            }
            
        }
        int half = n/2 -1;
        return (freq[half] == freq[n-1] - freq[half]);
        
    }
};