/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null) return result; 
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            
            List<Integer> inner = new ArrayList<>();
            while(size-- > 0){
                Node front = q.poll();
                for(int i=0; i < front.children.size();i++){
                    Node node = front.children.get(i);
                    q.add(node);
                }
                inner.add(front.val);
            }
            result.add(inner);
        }
        
        return result;
    }
}