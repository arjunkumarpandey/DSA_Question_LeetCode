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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null){
            return null;
        } 
        ListNode curr=head; 
        ListNode next=null; 
        ListNode prev=null; 
        int count=0; 

        ListNode temp=head;
        while(count<k && temp!=null){
            temp=temp.next;
            count++;
        }
        if(count<k){
            return head;
        }
        count=0;
        while(count<k && curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }
        return prev;
    }

}
