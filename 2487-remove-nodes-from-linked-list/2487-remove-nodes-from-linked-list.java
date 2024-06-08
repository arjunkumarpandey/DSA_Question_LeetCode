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
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while (curr!= null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode curr=head;
        ListNode temp=head.next;
        while(curr!=null && temp!=null){
            if(curr.val<=temp.val){
                curr.next=temp;
                curr=curr.next;
            }
            temp=temp.next;
        }
        curr.next=null;
        head=reverse(head);
        return head;
    }
}