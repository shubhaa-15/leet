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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode save=head;
        ListNode fast=head;
        ListNode slow=head;
        for(int i=1; i<k; i++){
            save=save.next;
        }
        for(int i=1; i<k; i++){
            fast=fast.next;
        }
        while(fast.next != null){
            fast=fast.next;
            slow=slow.next;
        }
        int temp=save.val;
        save.val=slow.val;
        slow.val=temp;
        return head;
    }
}