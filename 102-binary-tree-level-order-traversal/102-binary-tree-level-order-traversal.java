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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> outer = new ArrayList<>();
        LinkedList<TreeNode> q = new LinkedList<>();
        if(root == null){
            return outer;
        }
        q.add(root);
        while(q.size() > 0){
            int size = q.size();
            List<Integer> inner = new ArrayList<>();
            for(int i=0; i < size;i++){
                TreeNode node = q.removeFirst();
                
                if(node == null)    break;
                if(node.left != null)   q.add(node.left);
                if(node.right!= null)   q.add(node.right);
                inner.add(node.val);
            }
            outer.add(inner);
        }
        return outer;
    }
}