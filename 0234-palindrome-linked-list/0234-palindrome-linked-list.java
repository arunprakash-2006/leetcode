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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s1=new Stack<>();
        ListNode tptr=head;
        ListNode tptr1=head;
        while(tptr!=null)
        {
            s1.add(tptr.val);
            tptr=tptr.next;
        }

        while(tptr1!=null)
        {
            int top=s1.pop();
            if(tptr1.val!=top)
            {
                return false;
            }
            tptr1=tptr1.next;
        }

        return true;

        
    }
}