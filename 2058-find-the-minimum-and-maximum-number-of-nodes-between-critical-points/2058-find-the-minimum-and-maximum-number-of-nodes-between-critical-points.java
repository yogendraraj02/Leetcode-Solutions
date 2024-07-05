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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        ListNode low = head , mid = head.next , high = head.next.next;
        int idx = 1;
        int[] res = {-1,-1};
            
        if(high == null){
            return res;
        }
        
        List<Integer> result = new ArrayList<Integer>();
        while(high != null){
            
            if(low.val < mid.val && high.val < mid.val){
                // higher critical point
                result.add(idx);
            } else if(low.val > mid.val && high.val > mid.val){
                // lower critical point
                result.add(idx);
            }
            
            low = low.next;
            mid = mid.next;
            high = high.next;
            idx++;
        }
        int n = result.size();
        // int []res = {-1,-1};
        if(n < 2){
            return res;
        }
        int minD = result.get(n-1);
        for(int i = n-1; i> 0; i--){
            minD = Math.min(result.get(i)-result.get(i-1) , minD);
        }
        int maxD = result.get(n-1) - result.get(0);
        res[0] = minD;
        res[1] = maxD;
        return res;
    }
}