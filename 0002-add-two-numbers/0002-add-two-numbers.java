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
        ListNode a=new ListNode(0);
        ListNode cur=a;
        int a1=0,a2=0,carry=0;
        while(l1!=null || l2!=null || carry!=0)
        {
            if(l1!=null) a1=l1.val;
            else a1=0;
            if(l2!=null) a2=l2.val;
            else a2=0;

            int sum=a1+a2+carry;
            carry=sum/10;
            cur.next=new ListNode(sum%10);
            cur=cur.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }

        return a.next;

        
    }
}