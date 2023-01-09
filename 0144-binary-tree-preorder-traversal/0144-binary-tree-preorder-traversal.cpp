/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> res;
        
        // if(root == NULL) return res;
        stack<TreeNode*> s;
        TreeNode* curr = root;
        while(curr != NULL || s.size() > 0){
            
            
            while(curr != NULL){
                res.push_back(curr->val);
                if(curr->right != NULL){
                    s.push(curr->right);
                } 
                curr = curr->left;
            }
            if(s.size() > 0){
                curr = s.top();
                s.pop();
            }
        }
        
        return res;
    }
};

    
  