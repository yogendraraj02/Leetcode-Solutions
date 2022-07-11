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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans = new LinkedList<>();
        if(root == null)    return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            TreeNode front = q.peek();
            while(!q.isEmpty() && size-- > 0){
                front = q.peek();
                if(front.left!=null)    q.add(front.left);
                if(front.right!=null)   q.add(front.right);
                q.poll();
            }
            ans.add(front.val);
        }
        return ans;
    }
}