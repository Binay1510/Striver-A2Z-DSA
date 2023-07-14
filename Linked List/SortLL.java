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

 //USE merge sort first find middle and then split into 2 half ->> perfrom merge sort  
class Solution {
    ListNode getMiddle(ListNode head){
        
        ListNode fast=head.next;
        ListNode slow= head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    //merge list
    ListNode mergeList(ListNode l1, ListNode l2){
        if(l1==null) return l2;
        if(l2==null ) return l1;
        if(l1.val>l2.val){
            //swap
            ListNode temp = l1;
            l1=l2;
            l2=temp;
        }

        ListNode result = l1;
        while(l1 != null && l2 !=null){
            ListNode temp = null;
            while( l1 !=null && l1.val <= l2.val){
                temp=l1;
                l1=l1.next;
            }
            temp.next=l2;

            // swap 
            temp = l1;
            l1=l2;
            l2=temp;
        }
        return result;
    }

    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = getMiddle(head);

        ListNode left = head;
        ListNode right  = mid.next;
        mid.next= null ;
         
        left = sortList(left);
        right = sortList(right);

        return mergeList(left,right); 
        
    
        
    }
}
