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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> list = new ArrayList<>();
        if(root == null) return list;
        q.add(root);
        double sum = root.val *1.0; 
        
        while(!q.isEmpty()){
            int size = q.size();
            sum  =0.0;
            for(int i=0; i < size ; i++){
                TreeNode front = q.poll();
                if(front.left != null){
                    q.add(front.left);
                    //sum += front.left.val;
                }
                if(front.right != null){
                    q.add(front.right);
                    //sum += front.right.val;
                } 
                sum += front.val;
            }
            double avg = sum / size;
            list.add(avg);
        }
        return list;
    }
}