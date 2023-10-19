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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode temp=null;
        int s=0;
        while(l1!=null || l2!=null)
        {
            int sum=s;
            if(l1!=null)
            {
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                sum=sum+l2.val;
                l2=l2.next;
            }
            ListNode node=new ListNode(sum%10);
            s=sum/10;
            if(temp==null)
            {
                temp=head=node;
            }
            else{
                temp.next=node;
                temp=temp.next;
            }
        }
        if(s>0){
            temp.next=new ListNode(s);
        }
        return head;
        
    }
}