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
        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        //find middle of LL
        while(fast.next !=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
         //reverse LL
         slow.next = reverse(slow.next);
         slow=slow.next;

         //check palindrome

         while(slow!=null){
             if(head.val != slow.val){
                 return false;
             }
             head=head.next;
             slow=slow.next;
         }
         return true;
    }

    ListNode reverse(ListNode head){
        ListNode prev= null;
        ListNode curr=head;
        ListNode forward= null;

        while(curr!=null){
            forward= curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
}
