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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode result=new ListNode(0);
        result.next=list1;
        ListNode temp=list1;
        int count=0;
        while(count<a-1){
           temp=temp.next;
           count++; 
        }
        ListNode disconnectStart=temp;
        while(count<b){
           temp=temp.next; 
           count++;
        }
        ListNode disconnectEnd=temp.next;
        disconnectStart.next = list2;
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next=disconnectEnd;
        
        return result.next;
    }
}
