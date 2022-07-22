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
    public ListNode partition(ListNode head, int x) {
       ListNode left = new ListNode(-1);
        ListNode right = new ListNode(-1);
        ListNode rightTail = right, leftTail = left;
        ListNode curr =head;
        while(curr!= null){
            if(curr.val < x){
                leftTail.next = curr;
                leftTail = curr;
            } else{
                rightTail.next = curr;
                rightTail = curr;
            }
            curr= curr.next;
        }
        leftTail.next = right.next;
        rightTail.next = null;
        return left.next;
    }
}