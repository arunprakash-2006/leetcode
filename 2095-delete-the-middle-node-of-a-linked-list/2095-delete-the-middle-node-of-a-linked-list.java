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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next!=null)
        {
            return null;
        }
        else
        {
        int size=0;
        ListNode cur=head;
        while(cur!=null)
        {
            size++;
            cur=cur.next;
        }
        ListNode cur1=head;
        for(int i=0;i<(size/2)-1;i++)
        {
            cur1=cur1.next;
        }
        cur1.next=cur1.next.next;
        return head;
        }
    }
}



        
