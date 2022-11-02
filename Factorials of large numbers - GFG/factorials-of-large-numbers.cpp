//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++

class Solution {
public:
    vector<int> factorial(int N){
        // code here
        vector<int> ans;
        ans.push_back(1);
        
        for(int fact = 1 ; fact <= N ; fact++){
            vector<int> prev;
            int carry = 0;
            for(int i =0; i < ans.size(); i++){
                int digit = ans[i];
                int prod = fact * digit + carry;
                prev.push_back(prod % 10);
                carry = prod / 10;
            }
            while(carry!=0){
                prev.push_back(carry % 10);
                carry /= 10;
            }
            ans = prev;
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;
        Solution ob;
        vector<int> result = ob.factorial(N);
        for (int i = 0; i < result.size(); ++i){
            cout<< result[i];
        }
        cout << endl;
    }
    return 0;
}
// } Driver Code Ends