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
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        inorderTraversal1(root);
        return list;
    }
    public void inorderTraversal1(TreeNode root){
        if(root == null)    return;
        
        inorderTraversal1(root.left);
        
        list.add(root.val);
        inorderTraversal1(root.right);
        
    }
}