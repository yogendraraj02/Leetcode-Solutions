/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes1(TreeNode root , int mx) {
        if(root == null) return 0;
        int x = root.val;
        int ans = 0;
        mx = Math.max(root.val , mx);
        if(mx == x){
            ans += 1;
        }
        int left = goodNodes1(root.left , mx);
        int right = goodNodes1(root.right , mx);
        
        return left + right  + ans;
    }
    public int goodNodes(TreeNode root){
        return goodNodes1(root , Integer.MIN_VALUE);
    }
}