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
 // ITERATIVE APPROACH
 /*
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev =null;
        ListNode current = head;
        ListNode forward = null;   //or ListNode next;
 
        while(current!=null){
            forward=current.next;   //next=current.next;
            current.next=prev;
            prev=current;
            current=forward;        //curr=next;
        }
            
        return prev;
        
    }
}*/   // RECURSION APPROACH
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
       
        ListNode current = reverseList(head.next);
        head.next.next=head;
        head.next = null;
        return current;



        
    }
}
