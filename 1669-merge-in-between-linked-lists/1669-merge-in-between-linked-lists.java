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

        ListNode cur=list1;
        for(int i=0;i<a-1;i++)
        {
            cur=cur.next;
        }
       
        ListNode cur1=list1;
        for(int i=0;i<b+1;i++)
        {
            cur1=cur1.next;

        }
         cur.next=list2;

        while(list2.next!=null)
        {
            list2=list2.next;
        }
        list2.next=cur1;


    return list1;


        
    }
}