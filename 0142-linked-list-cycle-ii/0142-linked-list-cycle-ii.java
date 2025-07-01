/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) { 
        Set<ListNode> s1=new HashSet<>();
        ListNode cur=head;
        while(cur!=null)
        {
        if(s1.contains(cur))
        {
            return cur;
        }
        else
        {
        s1.add(cur);
        cur=cur.next;
        }
        }
        return null;
    }
}




        
