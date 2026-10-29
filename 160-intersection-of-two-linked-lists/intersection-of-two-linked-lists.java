/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=  headA;
        int lengthA=0;
        while(tempA!=null){
            tempA=tempA.next;
            lengthA++;
        }
        ListNode tempB=headB;
        int lengthB=0;
        while(tempB!=null){
            tempB=tempB.next;
            lengthB++;
        }
        tempA=headA;
        tempB=headB;
        if (lengthA>lengthB){ 
            for(int i=0; i<lengthA-lengthB; i++){ 
                tempA=tempA.next;
            } 
        }else{ 
            for(int i=0; i<lengthB-lengthA; i++){ 
                tempB=tempB.next; 
            }
        }
        while(tempA != tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
}