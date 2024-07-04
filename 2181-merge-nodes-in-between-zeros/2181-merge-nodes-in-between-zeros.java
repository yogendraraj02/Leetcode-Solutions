/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        ListNode node = head;
        int sum =0;
        ListNode resultHead = new ListNode(-1);
        ListNode resultNode = resultHead;
        while(node != null){
            
            int val = node.val;
            if(val == 0){
                if(sum > 0){
                    result.add(sum);
                    ListNode sumNode = new ListNode(sum);
                    resultNode.next = sumNode;
                    resultNode = resultNode.next;
                }
                sum = 0;
            }
            sum += val;
            
            node = node.next;
        }
        
        System.out.println(result);
        // while(resultHead != null){
        //     System.out.println("node res" + resultHead.val);
        //         resultHead = resultHead.next;
        // }
        return resultHead.next;
        
    }
}