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
    public ListNode reverseList(ListNode head){
        ListNode last= null;
        ListNode now= head;
        while(now != null){
            ListNode next = now.next;
            now.next=last;
            last=now;
            now=next;
        }
        return last;
    }
}