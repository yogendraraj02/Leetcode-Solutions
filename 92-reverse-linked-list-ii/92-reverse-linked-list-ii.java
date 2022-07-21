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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(right - left == 0)   return head;
        ListNode prev = null , curr = head;
        for(int i=0; i < left - 1 && curr!= null ; i++){
            prev = curr;
            curr = curr.next;
            
        }
        ListNode lefttail = prev, revLast = curr;
        //reverse
        int l = 0;
        prev = curr;
        curr = curr.next;
        ListNode forw = null;
        while(l++ < right - left && curr!= null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        
       
       if(lefttail == null){
           head = prev;
       }else {
           lefttail.next = prev;         
        }
            
        revLast.next = forw;          
        return head;
    }
}


// ListNode rightHead = forw;
//System.out.println("cr:"+curr.val +" lt:"+lefttail.val +" revLast:"+revLast.val+" frow:"+forw.val);
        