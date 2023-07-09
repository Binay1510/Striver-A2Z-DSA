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
 */    //USING FAST AND SLOW POINTER APPROACH
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                while(slow!=entry){
                    slow=slow.next;
                    entry=entry.next;
                }
                return entry;
            }
        }
        return null;
    }
}

//   USING HASHSET BUT SPACE IS EXTRA SO OPTIMIZE IT 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //Initialize empty hash set
        HashSet <ListNode> nodeSeen = new HashSet<>();

        ListNode node = head;

        while(node != null){
            if(nodeSeen.contains(node)){
                return node;
            }
            else{
                nodeSeen.add(node);
                node=node.next;
            }
        }
        return null;
    }
}
