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
    
    public boolean isPalindrome(ListNode head) {
        //getmidsecond
        //reverse 2nd
        //now compare
        ListNode sec = middleNode(head);
        ListNode revsec = reverseList(sec);
        while(head!= null && revsec!= null){
            if(head.val == revsec.val){
                head = head.next;
                revsec = revsec.next;
            }else{
                return false;
            }
            
        }
        return true;
        
    }
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode forw = curr.next; // backup

            curr.next = prev; // link

            prev = curr;
            curr = forw;
        }

        return prev;
    }
}