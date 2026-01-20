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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode res=dummy;
        ListNode tptr=head;
        ListNode tptr1=head;
        int count=1;
        while(tptr!=null)
        {
            if(count%2!=0)
            {
                res.next=new ListNode(tptr.val);
                res=res.next;
            }
            tptr=tptr.next;
            count++;
        }

        count=1;

        while(tptr1!=null)
        {
            if(count%2==0)
            {
                res.next=new ListNode(tptr1.val);
                res=res.next;
            }

            tptr1=tptr1.next;
            count++;
        }



        return dummy.next;
        
    }
}