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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head==null)
        return null;
        int count=1;
        ListNode curr=head;
        while(curr.next!=null){
            count++;
            curr=curr.next;
        }
        if(count<n)
        return null;
        ListNode temp=head;
        int i=0;
        if(count==1 && n==1)
        return null;
        if(count==n)
        return head.next;
        while(i<count-n){
            if(i+1==count-n){
                 temp.next=temp.next.next;
                 temp=temp.next;
                 i++;
                 break;
            }
            else{
                i++;
              temp=temp.next;
            }
           
        }
        
        return head;
    }
}