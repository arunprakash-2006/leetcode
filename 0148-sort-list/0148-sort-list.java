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
 import java.util.*;
class Solution {
    public ListNode sortList(ListNode head) {
                if (head == null) return head;

        List<Integer> a1=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null)
        {
            a1.add(cur.val);
            cur=cur.next;
        }

        Collections.sort(a1);
         cur=head;
        int i=0;
        while(cur!=null)
        {
            cur.val=a1.get(i);
            i++;
            cur=cur.next;
        }

        return head;
        
    }
}