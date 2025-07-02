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
    public ListNode modifiedList(int[] nums, ListNode head) {
         boolean[] b = new boolean[10001]; 
        for (int num : nums) {
            b[num] = true;
        }

        if(head==null && nums.length==0)
        {
            return null;
        }

        
        while (head != null && b[head.val]) {
            head = head.next;
        }

        
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (b[cur.next.val]) {
                cur.next = cur.next.next; 
            } else {
                cur = cur.next;
            }
        }

        return head;
    }
        
    }
