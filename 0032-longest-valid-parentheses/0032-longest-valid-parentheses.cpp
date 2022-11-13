class Solution {
public:
    int longestValidParentheses(string s) {
        stack<int> st;
        st.push(-1);
        int ans = 0;
        for(int i=0; i < s.length() ; i++){
            
            if(s[i] == '('){
                st.push(i);
            } else{
                st.pop();
                if(st.size()==0){
                    st.push(i);
                }
                int openIdx = st.top();
                ans = max(ans , i - openIdx );
                
            }
        }
        return ans;
    }
};